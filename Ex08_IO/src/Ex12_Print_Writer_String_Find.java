import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

//Ư�� �������� �˻��� �ܾ �־�����
//�� �ܾ ���Ե� ���� ��� ����ϱ�

public class Ex12_Print_Writer_String_Find {
	String baseDir = "C:\\Temp"; //������ �ִ�
	String word = "hellow"; //���� ã�� �ܾ�
	String save = "result.txt"; //�˻������ ���� ���
	
	void Find() throws IOException {
		File dir = new File(baseDir);
		
		if(!dir.isDirectory()) {
			System.out.println("baseDir :" + "is not directory or exist");
			System.exit(0);
		}
		
		PrintWriter writer = new PrintWriter(new FileWriter(save));
		BufferedReader br = null;
		
		File[] files = dir.listFiles();//����Ʈ ������ �ٰ������ڴٶ�� �� temp�Ʒ��ִ°�
		for(int i = 0 ; i <files.length; i++ ) {
			if(!files[i].isFile()) {//������ �ƴ϶��
				continue;//���� ������ ��ŵ��ŵ��~
			} 
			br = new BufferedReader(new FileReader(files[i]));
			//a.txt ,b.txt ���� read�� �غ�(buffer ���ؼ� line() ����)
			String line ="";
			while((line = br.readLine())!= null) {
				if(line.indexOf(word) != -1) {
					//��� (result.txt) ���ϸ�
					writer.write(word +" = " + files[i].getAbsolutePath());
				}
			}
			writer.flush();
			
		}
		br.close();
		writer.close();
		
	}
	public static void main(String[] args) {
		
		try {
			Ex12_Print_Writer_String_Find StringFind = new Ex12_Print_Writer_String_Find();
			StringFind.Find();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
	
		
		
	}
}

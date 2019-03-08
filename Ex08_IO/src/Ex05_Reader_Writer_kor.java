import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

//������
//1.�ѱ� 1�� >> 2byte , 2byte >> Stream(1Byte) >> �ѱ��� ����Ұ�
//2.��� �ϳ� �� ����� �ٰ� >> 2byte ��� >> reader, writer��� �̸����� �ٰ� �����\

public class Ex05_Reader_Writer_kor {
	public static void main(String[] args) {
		
		FileReader fr = null;
		FileWriter fw = null;
		
		try {
			fr = new FileReader("Ex01_Stream.java");
			fw = new FileWriter("copy_Ex02.txt");
			
			int data = 0;
			while((data = fr.read()) != -1) {
//				System.out.println(data);
//				fw.write(data);
				//�䱸���� ������ ����µ� ����, ����, ���� �����ϰ�
				if(data != '\t' && data != '\r' && data != ' ') {
					fw.write(data);
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		} finally {
			try {
				fw.close();
				fr.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}

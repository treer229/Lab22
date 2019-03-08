import java.io.BufferedReader;
import java.io.BufferedInputStream;
import java.io.FileReader;
import java.io.IOException;

public class Ex06_FIleReader_FileWriter_Buffer {
	public static void main(String[] args) {
//		try {
//			FileWriter fw = new FileWriter("today.txt");
//			BufferedWriter bw = new BufferedWriter(fw);
//			bw.write("�ζ�");
//			bw.newLine();//����
//			bw.write("1,2,3,4,5");
//			bw.flush(); //bw.close() �ɸ� �ڵ������� ���� �ȴٸ�
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
		
		FileReader fr = null;
		BufferedReader br = null;
		
		try {
			fr = new FileReader("Ex01_Stream.java");
			br = new BufferedReader(fr);//�׷� ���� �������ɸ� �� ������?
			String line = "";
			//br.readLine(); ���͸� �������� ���پ� read
			for(int i = 0; (line = br.readLine()) != null; i++) { //�� �������?
//				System.out.println(line);
// 				;���Ե� ���常 read �ϰ� �;��
				if(line.indexOf(";") != -1) {
					System.out.println(line);
				}
				
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			try {
				br.close();
				fr.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			
		}
	}
}

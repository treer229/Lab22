 import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/*\
 ��Ʈ���� ����� File(read, write) : ��ũ�� �����ϴ� ������ ����
 FileInputStream, FileOutputStream
 text ��� �۾� : C:\\Temp\\a.txt.....
 */


public class Ex02_Point_File_Read_Write {
	public static void main(String[] args) {
		
		//1�ܰ� 
		//POINT : I/O �۾��� GC ����� �ƴϴ�
		//�����۾��� �־�¿� Ű�� ������ ���ߵǿ� �ƴϸ� ���������ع����ž�
		//(�Լ� : close() -> ���������� �Ҹ��� �Լ� ȣ��);
		FileInputStream fs = null;
			
//		try {
//			fs = new FileInputStream("C:\\Temp\\a.txt");
//			int data = 0;
//			while((data = fs.read()) != -1) {
//				System.out.println("����(����)" + data); //����Ű �ڵ�� ���� ������ ��ȯ����� �ȴٸ�
//				//read ���������� ����
//				//����Ű �ڵ�ǥ �������� �� ������;
//				System.out.println((char)data);
//			}
//		} catch (Exception e) {
//			e.printStackTrace();
//		} finally {
//			try {
//				fs.close();
//			} catch (IOException e) {
//				e.printStackTrace();
//			}
//		}
		
		 FileInputStream fis = null;
		 FileOutputStream fos = null;
		 String path = "C:\\Temp\\��������.txt";
		 
		 try {
			fis = new FileInputStream(path);
			fos = new FileOutputStream("C:\\Temp\\������ų�������.txt");
			//write
			//FileOutputStream Ŭ������ Temp ���� �ȿ� new.txt�� �������� ������
			//�ڵ����� ������ �����մϴ� >> ������ ���Ͽ� ����(write)
			
			//new FileOutputStream("C:\\Temp\\new.txt", true);
			//�������� �ι�° ���ڰ� (true)
			//���� ������ : append ����
			
			//new FileOutputStream("C:\\Temp\\new.txt", true);
			//default�� (false)
			//���� ������ : overwrite �����
			int data = 0;
			while((data = fis.read())!=-1) {
				fos.write(data); //new.txt; �ؽ�Ʈ�� ���ڵ����� �ڵ����� �ƽ�Ű�ڵ��������δٰ� ����
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally{
			try {
				fos.close();
				fis.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			
		}
	}
}

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 ��ǻ�� ���� ���� �۾�(I/O ���� read, write : Disk) 
 1.File �۾�(Disk) >> read, write >> byte ���� >> �ѳ��ѳ� �����ٸ�
 ���� �ذ�
 Buffer �޸�(�׾Ƶΰ� �ѹ��� �ѷ������� ���� ����)
 
 2.����������� �׳� buffer ���ÿ�...
 
 3.File I/O ���� ����
 4.Line ���� ó�� (���� ���....)
 5.JAVA API���� �����Ѵٸ�//������Ʈ��
 ������Ʈ���̶�? ���������� new�� ���ؤ̤� ������ �̤�(Parameter �����ڳ�)
 default �����ڸ� �������� �ʴ� �����ε��� ����
 */

public class Ex04_Stream_file_buffer {
	
	public static void main(String[] args) {
		
		FileOutputStream fos = null;
		BufferedOutputStream bos = null;
		
		try {
			fos = new FileOutputStream("data.txt");
			bos = new BufferedOutputStream(fos);
			
			for(int i =0; i<10; i++) {
				bos.write('A');
			}
			/*
			 ������
			 ���ۿ� ��µ� ���۴� ��ô��� ���� Write�Ѵ���?
			 java buffer 8kbyte -> 8192byte
			 1.buffer = �ȿ� ������ ä������ �ڵ����� ����(�� ����)
			 2.buffer ������ ���� ��� : flush() ����
			 3.bos.close() >> ���������� flush()�� ȣ�� �����ִ� �����͸� ������.
			 
			 */
		//	bos.flush();
		} catch(Exception e) {
			System.out.println(e.getMessage());
		} finally {
			try {
				bos.close();
				fos.close();
			} catch(IOException e) {
				e.printStackTrace();
			}
		}
	}
}

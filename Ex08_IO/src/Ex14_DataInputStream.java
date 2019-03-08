import java.io.DataInput;
import java.io.DataInputStream;
import java.io.FileInputStream;

//DataOutputStream ���� write�� �����ʹ� �ݵ�� DataInputStream ���� read �ؾ� �Ѵ�.

//������ó���� �����Ұ�� Ÿ���� �������༭ ��ô���ϰ� �Ѵ�.

public class Ex14_DataInputStream {
	public static void main(String[] args) {
		int sum = 0 ;
		int score = 0;
		
		FileInputStream fis = null;
		DataInputStream dis = null;
		
		try {
			fis = new FileInputStream("Score.txt");
			dis = new DataInputStream(fis);
			while(true) {
				score = dis.readInt();
				System.out.println("score int Ÿ�� :" + score);
				sum += score;
			}
		} catch (Exception e) {
			System.out.println(e);
			System.out.println("sum : " + sum);
		} finally {
			try {
				dis.close();
				fis.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	}
}

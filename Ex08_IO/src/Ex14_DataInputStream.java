import java.io.DataInput;
import java.io.DataInputStream;
import java.io.FileInputStream;

//DataOutputStream 으로 write한 데이터는 반드시 DataInputStream 으로 read 해야 한다.

//데이터처리를 진행할경우 타입을 지정해줘서 무척편리하게 한다.

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
				System.out.println("score int 타입 :" + score);
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

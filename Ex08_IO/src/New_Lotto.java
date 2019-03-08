import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.CharArrayReader;
import java.io.File;
import java.util.Random;
import java.util.Scanner;

public class New_Lotto {

	New_Lotto() {
		Scanner sc = new Scanner(System.in); // �ʱ�ȭ (���� ���� �ּҰ��� ���°�)
		Random r = new Random();
		int[] numbers = new int[6];
	}

	public static byte[] selectBasicLottoNumber() {
		// �Ƿζ� ��ȣ �����ϰ� �ߺ��� ���� ó���ϴ� �Լ�
		byte[] number = {1,1,1,1,1,1};
		for (int i = 0; i < number.length; i++) {
			number[i] = (byte)((int)(Math.random()*45)+1);
			for (int j = 0; j < i; j++) {
				if (number[i] == number[j]) {
					i--;
					break;
				}
			}
		}
		return number;
	}

	public static void showLottoNumbers(byte[] number) {
		for(int i = 0; i <number.length; i++) {
			System.out.print(number[i]);
		}
	}
	public static void main(String[] args) {
		byte[] lotnum = selectBasicLottoNumber();
		showLottoNumbers(lotnum);
		System.out.println();
		
	    	ByteArrayInputStream bis = null;
	    	ByteArrayOutputStream bos  = null;
	    	
	    	bis = new ByteArrayInputStream(lotnum);
	    	bos = new ByteArrayOutputStream();
	    	
	    	int data = 0;
	    	while((data = bis.read()) != -1) {
	    		System.out.println(data);
	    		bos.write(data);
	    	}

		String currentPath = System.getProperty("user.dir");
		System.out.println(currentPath);
		File f = new File(currentPath);
		f.mkdir();
	}
}

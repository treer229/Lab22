import java.io.DataOutputStream;
import java.io.FileOutputStream;

//뽀조 스트림
//JAVA API 제공 기본타입 모듀 쩨굥(타입별로 read, write) 클래슈
//DataOutputStram, DataInputStram


public class Ex13_DataOutputStream {
	public static void main(String[] args) {
		int[] score = {100, 50, 40, 30 ,2 , 13};
		try {
			FileOutputStream fos = new FileOutputStream("Score.txt");
			//헬퍼가 지금할 데이타 아웃풋 스트리미앋
			DataOutputStream dos = new DataOutputStream(fos);
			//데이타아웃풋스트림을 통해서 스코어 텍스트 에 롸잇뜨 하겠다
			for(int i =0 ; i< score.length; i++) {
				dos.writeInt(score[i]); //정수값을 write.... 반드시 read DataInputStream 고개괘괘고괘괘ㅗ개괘나옴
//				dos.writeUTF(str); 웹, 채팅 할때 주로 사용
			}
			
			dos.close();
			fos.close();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}

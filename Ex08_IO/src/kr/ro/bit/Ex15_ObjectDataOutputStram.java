package kr.ro.bit;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class Ex15_ObjectDataOutputStram {
	public static void main(String[] args) {
		//파일에 쓰는것 userinfo 객체를 >> userData.txt 파일에 >> write(직렬화)
		String filename = "UserData.txt";
		try {
			FileOutputStream fos = new FileOutputStream(filename, true);
			BufferedOutputStream bos = new BufferedOutputStream(fos);
			//append(true)
			
			//객체 직렬화
			//객체 단위로 (줄을 세워서)
			
			ObjectOutputStream out = new ObjectOutputStream(bos);
			
			UserInfo u1 = new UserInfo("superman", "super", 600);
			UserInfo u2 = new UserInfo("scott", "tiger" , 500);
			
			//직렬화 시작
			out.writeObject(u1); // u1을 조각내서 userData.txt write
			out.writeObject(u2); // u2 객체를 조각내서 userData.txt에 write
			
			out.close();
			bos.close();
			fos.close();
			System.out.println("파일생성>buffer>직렬화 객체 > write");
			
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}

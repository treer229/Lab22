package kr.ro.bit;
//userData.txt에 직렬화된 내용을 read해서 >> 역직렬화 >> 다시 조립 >> 제품 확인

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Ex16_ObjectDataInputStream {
	public static void main(String[] args) {
		String filename = "UserData.txt";
		FileInputStream fis =null;
		BufferedInputStream bis = null;
		ObjectInputStream in = null;
		
		try {
			fis = new FileInputStream(filename);
			bis = new BufferedInputStream(fis);
			in = new ObjectInputStream(bis); //역직렬화 실행
			 
			//UserInfo r1 = (UserInfo)in.readObject(); //복원 
			//UserInfo r2 = (UserInfo)in.readObject();
			
			//System.out.println(r1);
			//System.out.println(r2);
			Object users = null;
			while((users=in.readObject())!=null) {
				System.out.println(users.toString());
			}
			
		} catch (Exception e) {
			System.out.println(e);
		} finally {
			try {
				in.close();
				bis.close();
				in.close();
			} catch (IOException e) {
			
				e.printStackTrace();
			}
		}
	}

}

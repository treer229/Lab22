package kr.ro.bit;
//userData.txt�� ����ȭ�� ������ read�ؼ� >> ������ȭ >> �ٽ� ���� >> ��ǰ Ȯ��

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
			in = new ObjectInputStream(bis); //������ȭ ����
			 
			//UserInfo r1 = (UserInfo)in.readObject(); //���� 
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

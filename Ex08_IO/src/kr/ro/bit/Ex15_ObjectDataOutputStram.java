package kr.ro.bit;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class Ex15_ObjectDataOutputStram {
	public static void main(String[] args) {
		//���Ͽ� ���°� userinfo ��ü�� >> userData.txt ���Ͽ� >> write(����ȭ)
		String filename = "UserData.txt";
		try {
			FileOutputStream fos = new FileOutputStream(filename, true);
			BufferedOutputStream bos = new BufferedOutputStream(fos);
			//append(true)
			
			//��ü ����ȭ
			//��ü ������ (���� ������)
			
			ObjectOutputStream out = new ObjectOutputStream(bos);
			
			UserInfo u1 = new UserInfo("superman", "super", 600);
			UserInfo u2 = new UserInfo("scott", "tiger" , 500);
			
			//����ȭ ����
			out.writeObject(u1); // u1�� �������� userData.txt write
			out.writeObject(u2); // u2 ��ü�� �������� userData.txt�� write
			
			out.close();
			bos.close();
			fos.close();
			System.out.println("���ϻ���>buffer>����ȭ ��ü > write");
			
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
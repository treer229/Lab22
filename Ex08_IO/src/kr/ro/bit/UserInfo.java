package kr.ro.bit;
//�ٷ�� ������� �Ⱥپ������� ������ �ȵǹ�
import java.io.Serializable;

/*
 ��ü�� �ְ� �޴� ���(��ä���)
 ��Ʈ��ũ...(���μ���)
 ���ϰ���...(���Ͽ��� ��ü�� write, �� ������ read)
 
 ����ȭ (��ü�� �����ؼ� ���� ���� ������ ����)
 ������ȭ(���� ��ü�� �����ؼ� ����� ����)
 
 �׹W�� �ȵǰ��
 �ǽ�) txt����
 
 ��ü�� ���Ͽ��ٰ� write (����ȭ)
 ������ read(������ȭ)
 
 ����ȭ�� ������ ��ä�� ����� ���赵�� �ʿ�!
 
 ����(��ü ���) ���赵�� �ݵ�� �ٸ��� ������� �ٿ��� (inplement serializable)
 
 
 */

public class UserInfo implements Serializable {
	public String name;
	public String pwd;
	public int age;
	
	public UserInfo() {
		
	}
	public UserInfo(String name, String pwd, int age) {
		this.name = name;
		this.pwd = pwd;
		this.age = age;
	}
	@Override
	public String toString() {
		return "UserInfo [name=" + name + ", pwd=" + pwd + ", age=" + age + "]";
	}
	
	
}

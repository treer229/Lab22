
//������
//������ : �������� ������ ���� �� �ִ� �ɷ�

//JAVA : [��Ӱ���]���� �ϳ���[��������]�� �������� Ÿ���� ���� �� �ִ�.
//���⼭ ���ϴ� ���� ������ ����Ÿ���� �̾߱� �Ѵ�.
//����Ŭ���� Ÿ���� ���������� �������� �ڽ�Ŭ���� ��ü�� �ּҸ� ���� �� �ִ�.

//JAVA : �ڽ��� �θ𿡰� ���Ǿ��� �帰�� 

class Tv2 {
	boolean power;
	int ch;
	
	void power() {
		this.power = !this.power;
	}
	void chUp() {
		ch++;
	}
	void chDown() {
		ch--;
	}
}	

class CapTv extends Tv2 {//��üȭ, Ư��ȭ �ϸ�ʿ�
	String text;
	String Caption() {
		return this.text = "�ڸ�ó����";
	}
}

public class Ex10_Inherit_Pl {
	public static void main(String[] args) {
		CapTv captv = new CapTv();
		captv.power();
		System.out.println(captv.power);
		captv.chUp();
		System.out.println(captv.ch);
		//��������� ���� ���� �н�
		
		Tv2 tv2 = new Tv2();
		
		tv2 = captv;
		System.out.println(tv2.toString());
		System.out.println(captv.toString());
		
		
	}
}

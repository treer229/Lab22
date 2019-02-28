/*
 ������ ����(��������)
 �̱��� : ��ü�� �ϳ��� ���� ����
 
 �������� ����ϸ� �ϳ��� ��ü�� ������� ����
 
 static (��ü�� ���� �ڿ�)
 
 */


public class Singleton {
	private static Singleton p; //Singleton ����ϸ� method area ������ �ö� �ִ�.
	//private ���� �ζ�
	private Singleton() {}
	
	public static Singleton getInstance() {
		if(p == null) {
			p = new Singleton(); //������ ȣ��(private Ŭ���� ����...
		}
		return p;
	}
	
}

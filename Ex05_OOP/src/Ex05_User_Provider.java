//�������̽��� ������ ���忡�� ����(�������̽��� �θ� Ÿ�Դϴ�.)
//���� �������� ���� Ŭ������ ���ؼ� �ϳ��� ���°��� ����
//����ڿ� �������� ����

//user(�����), Provider(������)

/*
 1.��� : is ~ a : A extends B
 2.���� : has ~ a : member field ���·�  A��� class �ȿ� B��� Ŭ������ �����°�
 �б��� �л��� ������ �ִ�. > ���տ��� �б��� ������� �л��� �״�� �����ֽ�
�ڵ����� ������ ������ �ִ�. > ���տ��� ���� ������� ������ ���� ��������
 3. ����(Dependency) : �Լ� �ȿ���(��ü ����, �Ҵ�, return) Dependency ��������
 
 
 class B{}
 
 class A{}
 	int i;
 	
 	void print(B b) { //method(����)
 	
 	
 	}
 	
 	void print() { //method(����)
 	B b = new B();
 }
 
 
 */
interface Icall{
	void m();
}

class D implements Icall {

	@Override
	public void m() {
		System.out.println("D Icall �������̽��� m() ����");
		
	}
	
}

class F implements Icall {

	@Override
	public void m() {
		System.out.println("F Icall �������̽��� m() ����");
		
	}
	
}
//������(�������̽�)
//������ ���α׷���

class C {
	void method(Icall ic) {
		ic.m();
		
	}
}

public class Ex05_User_Provider {
	public static void main(String[] args) {
		
		C c = new C();
		c.method(new D());
		c.method(new F());
		
	}
}

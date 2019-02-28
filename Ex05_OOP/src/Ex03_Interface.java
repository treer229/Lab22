
/*
 �߻� Ŭ������ �������̽��� ������
 1. ������ ��ü ���� �Ұ���
 2. ���, ������ ���ؼ��� ��밡��(�޸𸮿� ���� ����)
 3. ������ ���� ���� ������ ����
 
 �߻� Ŭ������ �������̽��� �ٸ���
 1.�������̽��� �����ϰ� ���߻���� ����(
  Ex) interface Ia , interface Ib
  	class Child implements Ia, Ib
 2. �߻�Ŭ������ ���ϻ���� ��Ģ
 3. �߻�Ŭ����(�ϼ��� �ڵ� + �̿ϼ��� �ڵ�)
 4. �������̽��� ����� ������ �������� �̿ϼ� �ڵ�(�߻��ڿ�)
 5. �������̽������� ��Ӱ���(���߻�� ����)
 6. �ϳ��� Ŭ������ �������� �������̽��� ��������
 
 
 ++++++++++++++++++++++++++++++++++++
 ������ ����
 1.�������̽��� [������] ���忡�� ����(�������̽��� �θ� Ÿ�Դϴ�)
 2.���� �������� ���� Ŭ������ ���ؼ� �ϳ��� ���� ���
 3.�������̽�(~able) : �� �� �ִ�, ������ �� �� �ִ�(����)
 4.��ü���� ���� ��(��ü���� ������ ��Ȱ)
 ++++++++++++++++++++++++++++++++++++
 
 
 �������̽�(interface)
 ������ �ǹ�
 1.���, ǥ��, ��Ģ, �Ծ���� ����� ����
 
 ����Ʈ���� ����
 >>�������̽��� ������ �ֻ��� �ܰ�(������ ����)
 >>���� ǥ��, ����� ���ϴ� ����
 
 
 interface
 1.���� �����ΰ� ���� : ������� ���� 
 2.ǥ��ȭ�� ���踦 ����(�Ϻ��� ������ ����)
 3.���뼳��
 
 JAVA API
 (�����ڰ� �ʿ��� �������̽��� ������ �ִ�) : ���  Ŭ������ �������̽� ����� ����
>> Collection <<

1.�������
���(final) : public static final int NUM = 0; >> �ۺ� ����ƽ ���̳� �����ϳ���
�Լ�(method) : public abstract void run(); >> {} ��ɷ� ����
�Լ�(method) : public abstract String move(int x, int y); >> public abstract ����
�������̽��� ������ ���� �߻�޼��常 ������...
 
1.�������̽��� ��ü ���� �Ұ� (����� ������ ������ �߻��Լ�)
2.������ ���ؼ��� ��밡��(class Test implements Ia..)
3.Ŭ������ �������̽��� ���� ������ ����(class Test implement Ia, Ib, Ic....)
4.�������̽������� ����� ����(Ia extends Ib : ū ��Ģ�� ����� �ִ�)
5.�������̽��� �ϳ��� Ÿ�Դϴ�(POINT);
*/

interface Ib {
	int AGE = 0;

	void info();

	String value(String s); // interface�� ������ ���ؼ�

}

class Test implements Ib {

	@Override
	public void info() {
		// TODO Auto-generated method stub

	}

	@Override
	public String value(String s) {
		// TODO Auto-generated method stub
		return null;
	}

}

interface Irepairable {
}; // I~, ~able��н����� �ۼ��Ѵ�~ �̸��̾�~~~~~

class Unit2 {
	int hitPoint;
	final int MAX_HP;

	Unit2(int MAX_HP) {
		this.MAX_HP = MAX_HP;
	}

}

//��������
class Ground extends Unit2 {

	Ground(int MAX_HP) {
		super(MAX_HP);
		// TODO Auto-generated constructor stub
	}

}

class Air extends Unit2 {

	Air(int MAX_HP) {
		super(MAX_HP);
	}

}

class Tank2 extends Ground implements Irepairable {

	Tank2() {
		super(100);
		this.hitPoint = this.MAX_HP;
	}

	@Override
	public String toString() {
		return "Tank2";
	}
}

class Marine2 extends Ground {

	Marine2() {
		super(50);
		this.hitPoint = this.MAX_HP;
	}

	@Override
	public String toString() {
		return "Marine2";
	}

}

class CommandCenter implements Irepairable {

	@Override
	public String toString() {
		return "CommandCenter";
	}
}

class Scv2 extends Ground implements Irepairable {

	Scv2() {
		super(60);
		this.hitPoint = this.MAX_HP;
	}

	@Override
	public String toString() {
		return "Scv";
	}

	// Scv Ư��ȭ, ��üȭ, ��üȭ
	// �����Ҽ��ִ�.(repair)
	// Scv�� ������ ������ŭ ���� ������ �־�� �Ѵ� �������� �Ⱦ��� ���̾�~
	// ���� �߰��� ����� �Լ��� �߰������ �Ѵ� �̸��̾�~
	// �����? �ϳ��� �Լ��� �ٸ� ��� ������ ������ �� ������?
	//
	void repair(Irepairable repair) { // ������ ��ü�� Ÿ���� �� �Ǵ� ��
		if (repair instanceof Unit2) {
			// downcasting
			Unit2 unit = (Unit2) repair;
			if (unit.hitPoint != unit.MAX_HP) {
				unit.hitPoint = unit.MAX_HP; // ����ȸ�����ڳ�~
			} else {
				System.out.println("������ �ƴմ��� �ٸ� ����� �Ѵ�ϴ�.");
			}
		}
	}
}

public class Ex03_Interface {
	public static void main(String[] args) {
		Test t = new Test();
		Ib ia = t; // ������(�θ�Ÿ��)

		Tank2 tt = new Tank2();
		Scv2 ss = new Scv2();
		Marine marine = new Marine();
	}
}
/*
 �߻� Ŭ����
 �̿ϼ� ���赵�̴�.
 {} ���� ���� ����
 new�� ���� ��ü ������ �Ұ���
 
 1.�߻�Ŭ������ ������ ��ü ���� �Ұ�
 2.�߻�Ŭ������ �ᱹ �ϼ��� Ŭ������ ���� ��� -> ����� ���ؼ�
 �̿ϼ� �ڿ�(�߻� �Լ�) �ϼ� �ض�
 */

abstract class Abclass {

	int pos;

	void run() {
		pos++;
	}
	// �� �ڵ�� �ϼ��� �ڵ�

	// �߻��Լ�(�߻��ڿ�)
	
	//�� ���������?
	//������ ������ ����
	
	abstract void stop();

}

class Child extends Abclass {

	@Override
	void stop() {

		this.pos = 0;
		System.out.println(this.pos);

	}

}

public class Ex01_abstract_class {
	public static void main(String[] args) {

		Child ch = new Child();
		
		ch.run();
		ch.stop();
		
		Abclass ab = ch;
		ab.run();
		ab.stop();
		
		
		
	}
}
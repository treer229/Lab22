/*
 starcraft;
 
 
 ������(�̵���ǥ, �̵�, �����)
 �̵������ �ٸ���(unit....)
 
 ���� : unit Ŭ������ ���� Ƽ������ ����..... ������ unit �����....
 
 
 */

abstract class Unit {
	int x, y;
	void stop() {
		System.out.println("Unit stop");
	}
	
	abstract void move(int x, int y);//���ư���, �ɾ�� .....
	//�߻��ڿ��� ��üȭ�ǰ� Ư��ȭ�ǰ� ��üȭ �Ǿ��Ѵ�.
	
	
}

class Tank extends Unit {

	@Override
	void move(int x, int y) {
		this.x = x;
		this.y = y;
		System.out.println("��ũ�̵�"+ this.x + "," + this.y);
		
	}
	
	//Tank ��üȭ Ư��ȭ....
	void changeMode() {
		System.out.println("��ũ ��ȯ ��� ����");
	}
	
	void pungta() {
		System.out.println("������ �߽�");
	}
}

class Marine extends Unit {

	@Override
	void move(int x, int y) {
		this.x = x;
		this.y = y;
		
		System.out.println("�Ӹ��̵�"+ this.x + "," + this.y);
		
	}
	
	void steampack() {
		System.out.println("������ ��� ������");
	}
	
}

class Dropship extends Unit {

	@Override
	void move(int x, int y) {
		this.x = x;
		this.y = y;
		
		System.out.println("�ζ����̵�"+ this.x + "," + this.y);	
	}
	void load() {
		System.out.println("Unit load");
	}
	
	void unload() {
		System.out.println("Unit unload");
	}
	
}

public class Ex02_abstract_class {

	public static void main(String[] args) {
		Tank tank = new Tank();
		tank.move(100, 200);
		tank.stop();
		tank.changeMode();
		
		Marine m = new Marine();
		m.move(300, 200);
		m.stop();
		m.steampack();
		
		//1.Quiz ��ũ 3�븦 ����� ���� ��ǥ�� �̵� (�迭�� ��ũ�� ����, �������� t�̵�)
		Unit[] bude3 = {new Tank(), new Marine(), new Dropship()};
		
		for(Unit t : bude3) {
			t.move(10, 200);
		}
		//Today Point
		//���� �ٸ� �͵��� �ϳ��� �θ� ����� �����ν� �ϳ��� ���°��� ���ϴ� �������� �𸣴� ������ �ϸ鼭 ��������
		
	}

}

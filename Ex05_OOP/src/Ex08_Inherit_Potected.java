import kr.or.beat.Pclass;

//protected;
//��Ӱ��迡���� ����
//��鼺 : default, public 
//�ڽ�Ŭ���� ���� �Լ���

//���� ����ϴ� ����� �ڿ��� ������ ������ ���ڴµ�....(�ǵ�)


class Child2 extends Pclass{
	void method() {
		this.p = 1000; //��Ӱ��迡���� Protected�� public�̱� ������
		System.out.println(this.p);
	}
}

public class Ex08_Inherit_Potected {
	public static void main(String[] args) {
		Pclass pc = new Pclass();
		System.out.println(pc.j);
		
		Child2 ch = new Child2();
		ch.method();
	}
}

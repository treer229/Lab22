
class Pbase {
	int p = 100;
}

class Cbase extends Pbase {
	int c = 200;
}

//�θ�Ÿ���� �ּҰ��� �ڽ�Ÿ�Կ��� ����(���� > ����)
//�ݵ�� ����Ÿ�Կ� �´� ĳ����



public class Ex11_Inherit_Poly {
	public static void main(String[] args) {
		Cbase c = new Cbase();
		System.out.println(c);
		
		Pbase p = c;
		
	}
}

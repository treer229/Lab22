/*
 ����  <   > ���
 ��� : �ѹ� �������� ���� �Ұ�
 �ý��ۿ��� �ѹ� �������� ���� x�� : �ý��� ���� ��ȣ
 �Ϲݻ�ļ����� �������� ���� x�� : ������, �ֹι�ȣ
 
 ��� ���������� �빮��
 JAVA : final int NUM = 100;
 C# : const int NUM = 200;
 
 //final Ű����
  Ŭ���� �տ� : final class Car{} : ��� �Ұ���(extends�Ұ�)
  �Լ� �տ� : public final void print(){} >> ��Ӱ��迡�� ������ ������(���� x
 
  
  
 */

class Vcard {
	final String KIND = "heart";
	final int NUM = 10;

	void method() {
		// �ý��� ���(static final double PI = 3.14153e09
		System.out.println(Math.PI);
	}
}

//��ü���� �ٸ� ������� ���� �;��??
//��� ���� �ѹ� ���� ����
//
class Vcard2 {
	final String KIND; //
	final int NUM;

//	Vcard2(String KIND, int NUM) {
//		this.KIND = "d";
//		this.NUM = 6;
//	}
//}

//���������� �ʱ�ȭ�� �� �� �ִ� �ڵ� ����
	Vcard2(String kind, int num) {
		this.KIND = kind;
		this.NUM = num;
	}
}

public class Ex07_Final {
	public static void main(String[] args) {
		Vcard v = new Vcard();
		v.method();
		// v.KIND = "aa";

	}
}

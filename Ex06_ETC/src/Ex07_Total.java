import java.util.Scanner;

//�ֹι�ȣ �Է� ��ĳ��
//�� 6�ڸ� �� 7�ڸ�
//1.�ڸ��� üũ
//2.�޹�ȣ ù��° �ڸ��� 1~4������ ���� ���
//3.1,3���� 2,4���� ��� �����Լ�
//3���� �Լ� static���δٰ�

public class Ex07_Total {

	static boolean juminCheck(String ssn) {
		String[] arry = ssn.split("");
		boolean result = false;

		result = (arry.length == 14) ?  true : false;
		return result;
	}

	static boolean checkSex(String ssn) {
		boolean result;
		if(ssn.charAt(7)=='1' || ssn.charAt(7)=='3' ) {
			result = true;
			System.out.println("����� �����Դϴ�.");
		} else if(ssn.charAt(7)=='2' || ssn.charAt(7)=='4') {
			result = true;
			System.out.println("����� �����Դϴ�.");
		} else {
			result = false; 
			System.out.println("�߸��Է��ϼ̽��ϴ�.");
		}
		return result;
	}


	public static void main(String[] args) {
		String ssn = "";
		do {
			Scanner sc = new Scanner(System.in);
			System.out.println("�ֹ� ��ȣ �Է�");
			ssn = sc.nextLine();
		} while (!(juminCheck(ssn) && checkSex(ssn)));
		System.out.println("�ֹε�Ϲ�ȣ Ÿ�缺Ȯ�� ��");
		System.out.println("�ý��� ����");
		// ���

	}
}

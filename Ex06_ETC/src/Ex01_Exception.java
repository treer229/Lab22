
/*
 ���� �߻�
 1.����(Error) : ��Ʈ��ũ ���, �޸� ����, �ϵ���� (������ ó�� �Ұ���)
 2.����(Exception) : ��������...(0���� ������) >> �������� �ڵ� ó�� ����.... �ذ�...
 2-1 ���ܰ� �߻��Ǹ� ���α׷��� ���� �ǹ����� �̤� �ѳ� ���۾� �̤� �ֱ׷��°ž� �̤̤̤̤̤̤̤̤̤̤�
 2-2 ���� : �߸��� �ڵ带 �����ϴ� ���� �ƴϰ� .... ���� �߻��� ���������� ���� ���ϰ� �ϴ°�
 
 try {
 	�����ڵ�....
 	�����߻�...
  }catch(Exception e) {
  	������ �߻������� ������  ���� ������
  	1.���...
  	2.�α׿� ���//
  	3.�����ڿ��� �̸��� ������
  }finally {
  ���ܰ� �߻�(0), �߻�(x)
  �ǹ������� ���� �Ǿ�� �ϴ� ����
  ex) DB���� �۾�.... >> ��������
  }
  �������ڴ� ����� �߻��� �� �ִ� ���ܿ��� ó���ؾ��Ѵ�.
 
 
 */

public class Ex01_Exception {

	public static void main(String[] args) {
		System.out.println("Main Start");
			System.out.println("Main Logic ó��....");
//				System.out.println(0/0);
			System.out.println("Main Logic ó��....");
		System.out.println("Main End");
		
		
		System.out.println("Main Start");
		System.out.println("Main Logic ó��....");
		try {
			System.out.println(0/0);
		} catch (Exception e) {
			//���ܿ� ���� ó��
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		System.out.println("Main Logic ó��....");
		System.out.println("Main End");
	}

}







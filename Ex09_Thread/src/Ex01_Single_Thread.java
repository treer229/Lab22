


//�ѹ��� �ϳ��� �Լ��� �÷�
//�Լ��� ���������� ����

public class Ex01_Single_Thread { // �䴢���� ���α׷��̶� �η��
	
	public static void main(String[] args) {
		
		System.out.println("�� ���� �ϲ����ڳ�~"); 
		worker();
		worker2();
		System.out.println("�� ���⼭ �ְ�... �ȳ�...�̤�");
		
	}
	
	static void worker() {
		System.out.println("�� 1�� �ϲ����ڳ�~");
	}
	
	static void worker2() {
		System.out.println("�� 2�� �ϲ����ڳ�~");
	}
}

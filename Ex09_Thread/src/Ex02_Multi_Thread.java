
//�ڹٴ� ���߻���� �ȵǱ⶧���� �������̽��� ���ø���Ʈ�ϴ°ɷ� ���ư��ž�

/*
 Thread : ���μ������� �ϳ��� �ּ� �������(method��ư�ź񽺹����Ѱ�)
 
 Thread ������� (�������� Stack�� ��� ����?)
 
 1.Thread��� Ŭ������ ����ؼ�(extends)�ؼ� 
 �ݴٽ� Thread Ŭ������ ����� ��� run() ������ �ϼž� �մϴٿ� abstract��ϱ� >> �ٸ� Stack main() ��Ȱ
 
 2.implements Runable ���� >> class Test implements Runnable
 �ݵ�� run() �߻��Լ� ������
 
 */

//Thread�� �߻��� �ƴ� �Ϲ� Ŭ����
//Thread ���������� ��ü ��������

class Thread_1 extends Thread{
	@Override
	public void run() { //main �Լ� ��Ȱ >> ������ stack�� run() �ö󰣴�(���ϸ���)
		for(int i = 0; i < 1000; i++) {
			System.out.println("Thread_1 " + i + " " +this.getName());
		}
		System.out.println("Thread_1 run() END ......");
	}
}

class Thread_2 implements Runnable {

	@Override
		public void run() { //main �Լ� ��Ȱ >> ������ stack�� run() �ö󰣴�(���ϸ���)
			for(int i = 0; i < 1000; i++) {
				System.out.println("Thread_2 " + i + " " );
			}
			System.out.println("Thread_2 run() END ......");
	}
	
}

public class Ex02_Multi_Thread {
	
	public static void main(String[] args) {
		System.out.println("Main Start");
		//1.Thread_1 ��ü ����
		Thread_1 th = new Thread_1();
		th.start(); //>> Start�� stack�޸𸮸� ����� stack�� run() ���� �÷��ΰ� �Ҹ�
		
		for(int i = 0 ; i <1000; i++) {
			System.out.println("Main : " + i);
		}
		
		//2.��
		Thread_2 th2 = new Thread_2();
		Thread thread = new Thread(th2);
		thread.start();
		System.out.println("Main END");
	}
}

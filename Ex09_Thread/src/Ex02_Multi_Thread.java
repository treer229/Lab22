
//자바는 다중상속이 안되기때문에 인터페이스를 임플리먼트하는걸로 돌아간거양

/*
 Thread : 프로세스에서 하나의 최소 실행단위(method가튼거비스무리한거)
 
 Thread 생성방법 (여러개의 Stack은 어떻게 만듬?)
 
 1.Thread라는 클래스를 상쇽해서(extends)해서 
 반다시 Thread 클래스를 상속할 경우 run() 재정의 하셔야 합니다요 abstract허니까 >> 다른 Stack main() 역활
 
 2.implements Runable 구현 >> class Test implements Runnable
 반드시 run() 추상함수 재정의
 
 */

//Thread는 추상이 아닌 일반 클래스
//Thread 독자적으로 객체 생성가능

class Thread_1 extends Thread{
	@Override
	public void run() { //main 함수 역활 >> 별도의 stack에 run() 올라간다(제일먼저)
		for(int i = 0; i < 1000; i++) {
			System.out.println("Thread_1 " + i + " " +this.getName());
		}
		System.out.println("Thread_1 run() END ......");
	}
}

class Thread_2 implements Runnable {

	@Override
		public void run() { //main 함수 역활 >> 별도의 stack에 run() 올라간다(제일먼저)
			for(int i = 0; i < 1000; i++) {
				System.out.println("Thread_2 " + i + " " );
			}
			System.out.println("Thread_2 run() END ......");
	}
	
}

public class Ex02_Multi_Thread {
	
	public static void main(String[] args) {
		System.out.println("Main Start");
		//1.Thread_1 객체 생성
		Thread_1 th = new Thread_1();
		th.start(); //>> Start는 stack메모리를 만들고 stack에 run() 까지 올려두고 소먈
		
		for(int i = 0 ; i <1000; i++) {
			System.out.println("Main : " + i);
		}
		
		//2.번
		Thread_2 th2 = new Thread_2();
		Thread thread = new Thread(th2);
		thread.start();
		System.out.println("Main END");
	}
}

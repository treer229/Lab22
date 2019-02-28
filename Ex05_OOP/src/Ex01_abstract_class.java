/*
 추상 클래스
 미완성 설계도이다.
 {} 실행 블럭이 없다
 new를 통해 객체 생성이 불가능
 
 1.추상클래스는 스스로 객체 생성 불가
 2.추상클래스는 결국 완성된 클래스로 만들어서 사용 -> 상속을 통해서
 미완성 자원(추상 함수) 완성 해라
 */

abstract class Abclass {

	int pos;

	void run() {
		pos++;
	}
	// 위 코드는 완성된 코드

	// 추상함수(추상자원)
	
	//왜 만들었을까?
	//강제적 구현을 목적
	
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

/*
 추상 클래스와 인터페이스의 공통점
 1. 스스로 객체 생성 불가능
 2. 상속, 구현을 통해서만 사용가능(메모리에 적재 가능)
 3. 재정의 통한 강제 구현이 목적
 
 추상 클래스와 인터페이스의 다른점
 1.인터페이스는 유일하게 다중상속이 가능(
  Ex) interface Ia , interface Ib
  	class Child implements Ia, Ib
 2. 추상클래스는 단일상속이 원칙
 3. 추상클래스(완성된 코드 + 미완성된 코드)
 4. 인터페이스는 상수를 제외한 나머지는 미완성 코드(추상자원)
 5. 인터페이스간에는 상속가능(다중상속 가능)
 6. 하나의 클래스가 여러개의 인터페이스를 구현가능
 
 
 ++++++++++++++++++++++++++++++++++++
 개발자 입장
 1.인터페이스를 [다형성] 입장에서 접근(인터페이스는 부모 타입니다)
 2.서로 연관성이 없는 클래스에 대해서 하나로 묶는 기능
 3.인터페이스(~able) : 날 수 있는, 수리를 할 수 있는(설계)
 4.객체간의 연결 고리(객체간의 소통의 역활)
 ++++++++++++++++++++++++++++++++++++
 
 
 인터페이스(interface)
 범용적 의미
 1.약속, 표준, 규칙, 규약등을 만드는 행위
 
 스프트웨어 개발
 >>인터페이스는 개발의 최상위 단계(무에서 유를)
 >>설계 표준, 약속을 정하는 행위
 
 
 interface
 1.실제 구현부가 없다 : 실행블럭이 없다 
 2.표준화된 설계를 보장(완벽한 강제성 보장)
 3.공통설계
 
 JAVA API
 (개발자가 필요한 인터페이스는 가지고 있다) : 모든  클래스는 인터페이스 기반의 설계
>> Collection <<

1.생성방법
상수(final) : public static final int NUM = 0; >> 퍼블릭 스테틱 파이널 생략하낟잉
함수(method) : public abstract void run(); >> {} 요걸로 생략
함수(method) : public abstract String move(int x, int y); >> public abstract 생략
인터페이스는 구현이 없는 추상메서드만 가진다...
 
1.인터페이스는 객체 생성 불가 (상수를 제외한 나머지 추상함수)
2.구현을 통해서만 사용가능(class Test implements Ia..)
3.클래스는 인터페이스를 다중 구현이 가능(class Test implement Ia, Ib, Ic....)
4.인터페이스끼리는 상속이 가능(Ia extends Ib : 큰 규칙을 만들수 있다)
5.인터페이스도 하나의 타입니다(POINT);
*/

interface Ib {
	int AGE = 0;

	void info();

	String value(String s); // interface는 구현을 통해서

}

class Test implements Ib {

	@Override
	public void info() {
		// TODO Auto-generated method stub

	}

	@Override
	public String value(String s) {
		// TODO Auto-generated method stub
		return null;
	}

}

interface Irepairable {
}; // I~, ~able요론식으로 작성한다~ 이말이야~~~~~

class Unit2 {
	int hitPoint;
	final int MAX_HP;

	Unit2(int MAX_HP) {
		this.MAX_HP = MAX_HP;
	}

}

//지상유닛
class Ground extends Unit2 {

	Ground(int MAX_HP) {
		super(MAX_HP);
		// TODO Auto-generated constructor stub
	}

}

class Air extends Unit2 {

	Air(int MAX_HP) {
		super(MAX_HP);
	}

}

class Tank2 extends Ground implements Irepairable {

	Tank2() {
		super(100);
		this.hitPoint = this.MAX_HP;
	}

	@Override
	public String toString() {
		return "Tank2";
	}
}

class Marine2 extends Ground {

	Marine2() {
		super(50);
		this.hitPoint = this.MAX_HP;
	}

	@Override
	public String toString() {
		return "Marine2";
	}

}

class CommandCenter implements Irepairable {

	@Override
	public String toString() {
		return "CommandCenter";
	}
}

class Scv2 extends Ground implements Irepairable {

	Scv2() {
		super(60);
		this.hitPoint = this.MAX_HP;
	}

	@Override
	public String toString() {
		return "Scv";
	}

	// Scv 특수화, 구체화, 실체화
	// 수리할수있다.(repair)
	// Scv는 유닛의 개수만큼 리페어를 가지고 있어야 한다 다형성을 안쓰면 말이야~
	// 유닛 추가시 리페어 함수도 추가해줘야 한다 이말이야~
	// 고민은? 하나의 함수로 다른 모든 유닛을 수리할 수 없을까?
	//
	void repair(Irepairable repair) { // 들어오는 객체의 타입을 비교 판단 ㅑ
		if (repair instanceof Unit2) {
			// downcasting
			Unit2 unit = (Unit2) repair;
			if (unit.hitPoint != unit.MAX_HP) {
				unit.hitPoint = unit.MAX_HP; // 완전회복했자너~
			} else {
				System.out.println("유닛이 아닙뉘다 다른 리페어 한답니다.");
			}
		}
	}
}

public class Ex03_Interface {
	public static void main(String[] args) {
		Test t = new Test();
		Ib ia = t; // 다형성(부모타입)

		Tank2 tt = new Tank2();
		Scv2 ss = new Scv2();
		Marine marine = new Marine();
	}
}
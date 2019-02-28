//인터페이스를 다형성 입장에서 접근(인터페이스는 부모 타입니다.)
//서로 연관성이 없는 클래스에 대해서 하나로 묶는것이 가능
//사용자와 제공자의 관계

//user(사용자), Provider(제공자)

/*
 1.상속 : is ~ a : A extends B
 2.포함 : has ~ a : member field 형태로  A라는 class 안에 B라는 클래스가 들어오는것
 학교는 학생을 가지고 있다. > 집합연관 학교가 사라져도 학생은 그대로 남아있슘
자동차는 엔진을 가지고 있다. > 복합연관 차가 사라지면 엔진도 같이 뒤져버림
 3. 포함(Dependency) : 함수 안에서(객체 생성, 할당, return) Dependency 의존관계
 
 
 class B{}
 
 class A{}
 	int i;
 	
 	void print(B b) { //method(의존)
 	
 	
 	}
 	
 	void print() { //method(의존)
 	B b = new B();
 }
 
 
 */
interface Icall{
	void m();
}

class D implements Icall {

	@Override
	public void m() {
		System.out.println("D Icall 인터페이스의 m() 구현");
		
	}
	
}

class F implements Icall {

	@Override
	public void m() {
		System.out.println("F Icall 인터페이스의 m() 구현");
		
	}
	
}
//다형성(인터페이스)
//유연한 프로그래밍

class C {
	void method(Icall ic) {
		ic.m();
		
	}
}

public class Ex05_User_Provider {
	public static void main(String[] args) {
		
		C c = new C();
		c.method(new D());
		c.method(new F());
		
	}
}

/*
 변수  <   > 상수
 상수 : 한번 정해지면 변경 불가
 시스템에서 한번 정해지면 변경 x수 : 시스템 버전 번호
 일반상식선에서 정해지면 변경 x수 : 고유값, 주민번호
 
 상수 관용적으로 대문자
 JAVA : final int NUM = 100;
 C# : const int NUM = 200;
 
 //final 키워드
  클래스 앞에 : final class Car{} : 상속 불가능(extends불가)
  함수 앞에 : public final void print(){} >> 상속관계에서 재정의 하지마(사용빈도 x
 
  
  
 */

class Vcard {
	final String KIND = "heart";
	final int NUM = 10;

	void method() {
		// 시스템 상수(static final double PI = 3.14153e09
		System.out.println(Math.PI);
	}
}

//객체마다 다른 상수값을 갖고 싶어요??
//상수 값이 한번 설정 변경
//
class Vcard2 {
	final String KIND; //
	final int NUM;

//	Vcard2(String KIND, int NUM) {
//		this.KIND = "d";
//		this.NUM = 6;
//	}
//}

//강제적으로 초기화를 할 수 있는 코드 제공
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

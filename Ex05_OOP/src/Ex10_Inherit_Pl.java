
//다형성
//다형성 : 여러가지 성질를 가질 수 있는 능력

//JAVA : [상속관계]에서 하나의[참조변수]가 여러개의 타입을 가질 수 있다.
//여기서 말하는 참조 변수는 보모타입을 이야기 한다.
//조상클래스 타입의 참조변수로 여러개의 자식클래스 객체의 주소를 가질 수 있다.

//JAVA : 자식은 부모에게 조건없이 드린다 

class Tv2 {
	boolean power;
	int ch;
	
	void power() {
		this.power = !this.power;
	}
	void chUp() {
		ch++;
	}
	void chDown() {
		ch--;
	}
}	

class CapTv extends Tv2 {//구체화, 특수화 하면됨여
	String text;
	String Caption() {
		return this.text = "자막처리중";
	}
}

public class Ex10_Inherit_Pl {
	public static void main(String[] args) {
		CapTv captv = new CapTv();
		captv.power();
		System.out.println(captv.power);
		captv.chUp();
		System.out.println(captv.ch);
		//여기까지가 현재 까지 학습
		
		Tv2 tv2 = new Tv2();
		
		tv2 = captv;
		System.out.println(tv2.toString());
		System.out.println(captv.toString());
		
		
	}
}

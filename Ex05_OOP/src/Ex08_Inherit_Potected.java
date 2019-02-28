import kr.or.beat.Pclass;

//protected;
//상속관계에서만 존재
//양면성 : default, public 
//자식클래스 안쪽 함수안

//나를 상속하는 당신이 자원을 재정의 했으면 좋겠는데....(의도)


class Child2 extends Pclass{
	void method() {
		this.p = 1000; //상속관계에서는 Protected는 public이기 떄문에
		System.out.println(this.p);
	}
}

public class Ex08_Inherit_Potected {
	public static void main(String[] args) {
		Pclass pc = new Pclass();
		System.out.println(pc.j);
		
		Child2 ch = new Child2();
		ch.method();
	}
}

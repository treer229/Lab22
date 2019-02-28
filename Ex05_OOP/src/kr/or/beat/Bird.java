package kr.or.beat;

public class Bird {
	
	//상속관계에서 재정의
	//당신이 필요하다면 재정의해... 아마 필요할걸?
	
	
	//공통 : 새는 날 수 있다, 새는 빠르다.
	
	public void fly() {
		System.out.println("fling");
	}
	
	protected void movefast() {
		fly();
	}
}

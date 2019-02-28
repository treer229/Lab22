/*
 디자인 패턴(생성패턴)
 싱글톤 : 객체를 하나만 만들어서 공유
 
 이패턴을 사용하면 하나의 객체만 사용함을 보장
 
 static (객체간 공유 자원)
 
 */


public class Singleton {
	private static Singleton p; //Singleton 사용하면 method area 영역에 올라가 있다.
	//private 접근 부락
	private Singleton() {}
	
	public static Singleton getInstance() {
		if(p == null) {
			p = new Singleton(); //생성자 호출(private 클래스 내부...
		}
		return p;
	}
	
}

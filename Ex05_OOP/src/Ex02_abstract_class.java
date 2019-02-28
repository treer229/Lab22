/*
 starcraft;
 
 
 공통기능(이동좌표, 이동, 멈춘다)
 이동방법은 다르다(unit....)
 
 팀장 : unit 클래스를 만들어서 티원에게 배포..... 각각의 unit 만들어....
 
 
 */

abstract class Unit {
	int x, y;
	void stop() {
		System.out.println("Unit stop");
	}
	
	abstract void move(int x, int y);//날아간다, 걸어간다 .....
	//추상자원은 구체화되고 특수화되고 실체화 되야한다.
	
	
}

class Tank extends Unit {

	@Override
	void move(int x, int y) {
		this.x = x;
		this.y = y;
		System.out.println("땅크이동"+ this.x + "," + this.y);
		
	}
	
	//Tank 구체화 특수화....
	void changeMode() {
		System.out.println("탱크 변환 모드 실행");
	}
	
	void pungta() {
		System.out.println("퉁퉁포 발싸");
	}
}

class Marine extends Unit {

	@Override
	void move(int x, int y) {
		this.x = x;
		this.y = y;
		
		System.out.println("머린이동"+ this.x + "," + this.y);
		
	}
	
	void steampack() {
		System.out.println("스팀팩 사용 ㅎㄷㄷ");
	}
	
}

class Dropship extends Unit {

	@Override
	void move(int x, int y) {
		this.x = x;
		this.y = y;
		
		System.out.println("두랍십이동"+ this.x + "," + this.y);	
	}
	void load() {
		System.out.println("Unit load");
	}
	
	void unload() {
		System.out.println("Unit unload");
	}
	
}

public class Ex02_abstract_class {

	public static void main(String[] args) {
		Tank tank = new Tank();
		tank.move(100, 200);
		tank.stop();
		tank.changeMode();
		
		Marine m = new Marine();
		m.move(300, 200);
		m.stop();
		m.steampack();
		
		//1.Quiz 탱크 3대를 만들고 같은 좌표로 이동 (배열로 탱크를 생성, 포문으로 t이동)
		Unit[] bude3 = {new Tank(), new Marine(), new Dropship()};
		
		for(Unit t : bude3) {
			t.move(10, 200);
		}
		//Today Point
		//서로 다른 것들을 하나의 부모를 만들어 줌으로써 하나로 묶는것을 말하는 것일지도 모르는 생각을 하면서 지나가자
		
	}

}

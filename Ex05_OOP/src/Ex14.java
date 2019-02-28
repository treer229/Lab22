class Parent {
	int x = 100;

	void pmethod() {
		System.out.println("parent method");
	}
}

class Child3 extends Parent {
	int y = 200;

	int x = 2000; // c# 재정의 : 변수 무시하기

	void parent_x() {
		System.out.println(super.x);
	}
	
	@Override
	void pmethod() {
		System.out.println("재정의");
	}
}
public class Ex14 {
	public static void main(String[] args) {
		
		Child3 ch = new Child3();
		Parent pa = new Parent();
		pa.pmethod();
		ch.pmethod();
		
		Child3 c2 = new Child3();
		Parent PB = c2;
		
		PB.pmethod();
		c2.pmethod();
		
		
	}

}

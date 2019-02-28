import kr.or.beat.Bird;

class Ostrich extends Bird{
	void run() {
		System.out.println("´Þ¸°´Ù.");
	}
	
	void runrun() {
		
	}

	@Override
	protected void movefast() {
		// TODO Auto-generated method stub
		//super.movefast();
		run();
	}
}

class bi extends Bird{

	@Override
	protected void movefast() {
		// TODO Auto-generated method stub
		super.movefast();
	}
}

public class Ex09_Inherit_protected {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ostrich ost = new Ostrich();
		ost.run();
		ost.movefast();
		
		bi b = new bi();
		b.fly();
		b.movefast();
	}

}

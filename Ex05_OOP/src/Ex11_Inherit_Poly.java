
class Pbase {
	int p = 100;
}

class Cbase extends Pbase {
	int c = 200;
}

//부모타입의 주소값을 자식타입에게 전달(상위 > 하위)
//반드시 하위타입에 맞는 캐스팅



public class Ex11_Inherit_Poly {
	public static void main(String[] args) {
		Cbase c = new Cbase();
		System.out.println(c);
		
		Pbase p = c;
		
	}
}

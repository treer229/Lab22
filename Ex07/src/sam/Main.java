package sam;

import kr.or.bit.Body;
import kr.or.bit.Wheel;
import kr.or.bit.abs_BikeFac;

public class Main {
	public static void main(String[] args) {
		abs_BikeFac fa = new SamF();
		
		Body bo = fa.createBody();
		Wheel wh = fa.createWheel();
		
		System.out.println(bo.getClass());
		System.out.println(wh.getClass());
	}
}

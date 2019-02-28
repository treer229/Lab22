package sam;

import kr.or.bit.Body;
import kr.or.bit.Wheel;
import kr.or.bit.abs_BikeFac;

public class SamF implements abs_BikeFac {

	@Override
	public Body createBody() {
		// TODO Auto-generated method stub
		return new SamBo();
	}

	@Override
	public Wheel createWheel() {
		// TODO Auto-generated method stub
		return new SamWh();
	}
	 
}

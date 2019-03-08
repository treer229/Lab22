package sam;

public class SouthFac implements PizzaFac {
	
	PizzaFac pizzafac;
	
	@Override
	public Dough creatDough() {
		
		return new SoftDough();
	}
	
}

package sam;

public class NorthFac implements PizzaFac {
	PizzaFac pizzafac;

	@Override
	public Dough creatDough() {
		
		return new SsinDough();
	}
	


}

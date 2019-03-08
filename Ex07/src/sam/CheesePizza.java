package sam;

public class CheesePizza extends Pizza {
	PizzaFac pizzafac;

	public CheesePizza(PizzaFac pizzafac) {
		this.pizzafac = pizzafac;
	}
	
	@Override
	void prepare() {
		dough = pizzafac.creatDough();
		
	}
	
	
	
	
}

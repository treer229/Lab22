package sam;

public class Store {
	public static void main(String[] args) {
		
	Pizza pizza;
	Pizza pizza2;
	
	PizzaFac southpizzafac = new SouthFac();
	PizzaFac northpizzafac = new NorthFac();
	
	pizza = new CheesePizza(southpizzafac);
	pizza2 = new CheesePizza(northpizzafac);
	
	pizza.prepare();
	pizza2.prepare();
	
	
	}
}

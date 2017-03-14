public abstract class PizzaStore {
	
	public Pizza orderPizza(String type) {
		Pizza pizza;

		pizza = createPizza(type);

		pizza.prepare();
		pizza.bake();
		pizza.cut();
		pizza.box();

		return pizza;
	}
	//Although here's defined createPizza(), only in subclasses concrete types are created
	abstract Pizza createPizza(String type);
} 
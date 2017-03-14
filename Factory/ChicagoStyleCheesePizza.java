import java.util.*;
public class ChicagoStyleCheesePizza extends Pizza {
	public ChicagoStyleCheesePizza() {
		name = "Chicago style deep dish Cheese pizza";
		dough = "Extra Thick Crust Dough";
		sauce = "Plum Tomato Sauce";
		toppings.add("Shredded Mozzarella Cheese");
	}
	void cut() {
		System.out.println("Cutting the pizza into square slices");
	}
}
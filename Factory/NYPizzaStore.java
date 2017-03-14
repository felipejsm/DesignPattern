public class NYPizzaStore extends PizzaStore {
	Pizza createPizza(String item) {
		switch(item) {
			case "cheese" : return new NYStyleCheesePizza();
			//case "veggie" : return new NYStyleVeggiePizza();
			//case "clam"	  : return New NYStyleClamPizza();
			//case "pepperoni" : return new NYStylePepperoniPizza();
			default : return null;
		}
	}
}
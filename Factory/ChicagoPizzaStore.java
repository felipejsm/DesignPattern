public class ChicagoPizzaStore extends PizzaStore {
	Pizza createPizza(String item) {
		switch(item) {
			case "cheese" : return new ChicagoStyleCheesePizza();
			//case "veggie" : return new ChicagoStyleVeggiePizza();
			//case "clam"	  : return New ChicagoStyleClamPizza();
			//case "pepperoni" : return new ChicagoStylePepperoniPizza();
			default : return null;
		}
	}
}
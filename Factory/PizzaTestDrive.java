public class PizzaTestDrive {
	public static void main(String[] args) {
			//Choose pizza factory 
			//PizzaStore nyStore = new NYPizzaStore();
			PizzaStore chicagoStore = new ChicagoPizzaStore();

			//Pizza pizza = nyStore.orderPizza("cheese");
			//System.out.println("Juarez ordered a "+pizza.getName()+"\n");

			Pizza pizza = chicagoStore.orderPizza("cheese");
			System.out.println("Pablo ordered a "+pizza.getName()+"\n");			
	}
}
import java.math.BigDecimal;

public class Main{
	public static void main(String[] args) {
		Beverage beverage = new Espresso();
		System.out.println(beverage.getDescription() + " R$"+beverage.cost());

		Beverage beverage2 = new DarkRoast();
		//Wraping my beverage2 in a double Mocha layer
		beverage2 = new Mocha(beverage2);
		beverage2 = new Mocha(beverage2);

		System.out.println(beverage2.getDescription() + " R$"+beverage2.cost());

	}
}
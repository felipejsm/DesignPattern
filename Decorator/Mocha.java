import java.math.BigDecimal;
public class Mocha extends CondimentDecorator {
	Beverage currentBeverage;

	public Mocha(Beverage beverage) {
		currentBeverage = beverage;
	}
	public String getDescription() {
		return currentBeverage.getDescription() + " with Mocha.";
	}
	public BigDecimal cost() {
		return new BigDecimal("0.20").add(currentBeverage.cost());
	}
}
import java.math.BigDecimal;
public class HouseBlend extends Beverage {
	public HouseBlend() {
		description = "House Blend coffee";
	}
	public BigDecimal cost() {
		return new BigDecimal("0.50");
	}
}
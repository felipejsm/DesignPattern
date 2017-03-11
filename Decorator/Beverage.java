import java.math.BigDecimal;
public abstract class Beverage {
	String description = "Unknown Beverage";
	public String getDescription() {
		return description;
	}
	public abstract BigDecimal cost();
}
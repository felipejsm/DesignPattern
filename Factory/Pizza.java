import java.util.*;
public abstract class Pizza {
	String name;
	String dough;
	String sauce;
	List<String> toppings = new ArrayList<>();

	void prepare() {
		System.out.println("Preparing "+name);
		System.out.println("Tossing dough...");
		System.out.println("Adding sauce...");
		System.out.println("Adding topping: ");
		toppings.forEach(top -> System.out.println(" "+top));
	}
	void bake() {
		System.out.println("Bake for 25 minutes at 350");
	}
	void cut() {
		System.out.println("Cutting the pizza into diagonal slices");
	}
	void box() {
		System.out.println("Place pizza in offical box");
	}
	public String getName() {
		return name;
	}
}
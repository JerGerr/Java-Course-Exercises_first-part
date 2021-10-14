public class ObjectsPizzaArrayList {

	public static void main(String[] args) {
		Pizza pizzaOne = new Pizza("Diavolo",8.75);
		Pizza pizzaTwo = new Pizza("Frutti al Mare",9.00);
		Pizza pizzaThree = new Pizza("Alla Pollo",7.50);
		System.out.println(pizzaOne.toString());
		System.out.println(pizzaTwo.toString());
		System.out.println(pizzaThree.toString());
	}

}
class Pizza {
    private String name;
    private double price;

 
    public Pizza(String pizzaName, double pizzaPrice) {
        name = pizzaName;
        price = pizzaPrice;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

 
    public String toString() {
        return name + " (" + (String.format("%.2f", price)).replace(".", ",") + " euros)";
    }
}

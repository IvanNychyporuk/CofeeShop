package day6.hw6.coffeeShop;

public class Product {
	protected String name;
	protected double price;
	
	public Product() {
		}
	public Product (String name) {
		this.name = name;
	}
	public Product (String name, double price) {
		this(name);
		this.price = price;
	}
	
	public void printForMenu () {
		System.out.println(name + "                                            " + price + "$");
//		System.out.printf("%s\t %s\t", name, price+"$");
		
	}
	
	public String getName() {
		return name;
	}
	
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
}

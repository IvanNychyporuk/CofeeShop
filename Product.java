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

		System.out.printf("%-64s%s", name, price+"$");
		System.out.println();
		
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

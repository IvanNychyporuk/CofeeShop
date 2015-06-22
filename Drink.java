package day6.hw6.coffeeShop;

public abstract class Drink extends Product{
	
	protected int waterMl; // water in mLiters
	protected int sugarGr; // quantity of sugar grammes
	
	
	public void setWaterMl(int waterMl) {
		this.waterMl = waterMl;
	}
	public void setSugarGr(int sugarGr) {
		this.sugarGr = sugarGr;
	}
	public Drink() {
	}
	protected Drink(String name, int waterMl, int sugarGr, double price){
		this.name = name;
		this.waterMl=waterMl;
		this.sugarGr = sugarGr;
		this.price = price;
	}
	
	
	public int getSugarGr() {
		return sugarGr;
	}
	
	public int getWaterMl() {
		return waterMl;
	}
	
	
	
}

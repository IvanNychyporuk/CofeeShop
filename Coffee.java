package day6.hw6.coffeeShop;

public class Coffee extends Drink {
	private int coffeeGr; // quantity of coffee in grammes;
	private int milkMl; // milk in mLiters;
	private int chocolateGr;
	private int creamMl;

	public void setCoffeeGr(int coffeeGr) {
		this.coffeeGr = coffeeGr;
	}

	public void setMilkMl(int milkMl) {
		this.milkMl = milkMl;
	}

	public void setChocolateGr(int chocolateGr) {
		this.chocolateGr = chocolateGr;
	}

	public void setCreamMl(int creamMl) {
		this.creamMl = creamMl;
	}

	public Coffee() {
	}
	
	public Coffee(String name){
		this.name = name;
	}

	public Coffee(String name, int waterMl, int coffeeGr, int milkMl,
			int chocolateGr, int creamMl, int sugarGr) {
		super(name, waterMl, sugarGr, 0);
		this.coffeeGr = coffeeGr;
		this.milkMl = milkMl;
		this.chocolateGr = chocolateGr;
		this.creamMl = creamMl;
		calculatePrice();

	}

	public Coffee(String name, int waterMl, int coffeeGr, int milkMl,
			int chocolateGr, int creamMl, int sugarGr, double price) {
		super(name, waterMl, sugarGr, price);
		this.coffeeGr = coffeeGr;
		this.milkMl = milkMl;
		this.chocolateGr = chocolateGr;
		this.creamMl = creamMl;
	}
	
	public void printForMenu (){
		String ingridients = "coffee(" + coffeeGr+"gr)," + "sugar";
		
		

		if (milkMl != 0) {
			ingridients +=",milk(" + milkMl + "ml)";
			}
		if (chocolateGr != 0) {
			ingridients +=",chocolate(" + chocolateGr + "g)";
			
		}
		if (creamMl != 0) {
			ingridients +=",cream(" + creamMl + "ml)";
		}
		
		System.out.printf("%-18s%-46s%s",name,ingridients,price+"$");
		System.out.println();
	}

	public void calculatePrice() {
		double newPrice = coffeeGr * 0.1 + milkMl * 0.01 + chocolateGr * 0.01
				+ creamMl * 0.01;
		newPrice = Math.round(newPrice * 100);
		newPrice /= 100;
		System.out.println("Calculated price for "  + name + " is: " + newPrice + "$");
		super.setPrice(newPrice);
	}

	public int getCoffeeGr() {
		return coffeeGr;
	}

	public int getMilkMl() {
		return milkMl;
	}

	public int getChocolateGr() {
		return chocolateGr;
	}

	public int getCreamMl() {
		return creamMl;
	}

}

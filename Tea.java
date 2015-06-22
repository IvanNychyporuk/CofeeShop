package day6.hw6.coffeeShop;

public class Tea extends Drink {
//	TypeOfTea type;
	private boolean bergamot;
	private boolean mint;
	private boolean lemon;
	
//	public Tea() {
//		}
	public Tea (String name) {
		super(name, 200, 14, 0.2);
	}
	
	public Tea(String name, double price) {
		super(name, 200, 14, price);
		
	}
	
	public void calculatePrice () {
		if (bergamot) {
			price += 0.1;
		}
		if (mint) {
			price += 0.1;
		}
		if (lemon) {
			price += 0.1;
		}
		price = Math.round(price * 100);
		price /= 100;
	}
	
	public void printForMenu () {
		System.out.print(name + "            tea, sugar");
		if (bergamot) {
			System.out.print(", bergamot");
		}
		if (mint) {
			System.out.print(", mint");
		}
		if (lemon) {
			System.out.print(", lemon");
		}
		System.out.println("             " + price + "$");
	}
	
	public boolean isBergamot() {
		return bergamot;
	}
	public void setBergamot(boolean bergamot) {
		this.bergamot = bergamot;
		calculatePrice ();
	}
	public boolean isMint() {
		return mint;
	}
	public void setMint(boolean mint) {
		this.mint = mint;
		calculatePrice ();
	}
	public boolean isLemon() {
		return lemon;
	}
	public void setLemon(boolean lemon) {
		this.lemon = lemon;
		calculatePrice ();
	}
//	public TypeOfTea getType() {
//		return type;
//	}
}

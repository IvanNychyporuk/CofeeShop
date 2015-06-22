package day6.hw6.coffeeShop;

public class Service {
	
	static Product [][] menu = new Product [3][]; // 0 - coffee, 1 - tea, 2 - other;  
	
	public static void main (String [] args) {
		
	}
	
	void runProgram(){
		fillTestForDemo();
		printMenu();
	}
	
	void fillTestForDemo (){
		addProduct(new Coffee("Black coffee", 100, 7, 0, 0, 0, 7));
		addProduct(new Coffee("Coffee with milk", 100, 7, 100, 0, 0, 14));
		addProduct(new Tea("Black tea"));
		addProduct(new Tea("Black bergamot"));
		((Tea) menu[1][1]).setBergamot(true);
		addProduct(new Tea("Lemon Tea"));
		((Tea) menu[1][2]).setLemon(true);
		addProduct(new Product("Bread", 0.5));
	
		
	}
	
	
	void printMenu() {
		System.out.println("---------------------- Menu ------------------------");
		System.out.println("Name                  Ingridients              Price");
		System.out.println("----------------------------------------------------");
		System.out.println("COFFEE");
		for (Product p: menu[0]) {
			p.printForMenu();
		}
		System.out.println("TEA");
		for (Product p:menu[1]) {
			p.printForMenu();
		}
		System.out.println("Additional products");
		for (Product p:menu[2]) {
			p.printForMenu();
		}
	}
	
	void addProduct(Product p) {
		int typeId = 2;
		if (p instanceof Coffee) {
			typeId = 0;
		} else if (p instanceof Tea) {
			typeId = 1;
		}
		if (menu[typeId] != null) {
			Product [] newPosition = new Product [menu[typeId].length +1];
			System.arraycopy(menu[typeId], 0, newPosition, 0, menu[typeId].length);
			newPosition[newPosition.length-1] = p;
			menu[typeId] = newPosition;
		} else {
			Product [] newPosition = new Product [1];
			newPosition[0] = p;
			menu[typeId] = newPosition;
		}
	}
	
}

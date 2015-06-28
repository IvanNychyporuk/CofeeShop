package day6.hw6.coffeeShop;

public class Service {
	
	static Product [][] menu = new Product [3][]; // 0 - coffee, 1 - tea, 2 - other;  
	
	public static void main (String [] args) {
		
	}
	
	void runProgram(){
		fillTestForDemo();
		printMenu();
		removeProduct("Capuccino");
		changePrice("Mocaccino", 1.5);
		printMenu();
	}
	
	void fillTestForDemo (){
		addProduct(new Coffee("Black coffee"));
		((Coffee) menu[0][0]).setCoffeeGr(7);
		((Coffee) menu[0][0]).setWaterMl(100);
		((Coffee) menu[0][0]).setSugarGr(7);
		((Coffee) menu[0][0]).calculatePrice();
				
		addProduct(new Coffee("Coffee with milk"));
		((Coffee) menu[0][1]).setWaterMl(100);
		((Coffee) menu[0][1]).setCoffeeGr(7);
		((Coffee) menu[0][1]).setSugarGr(14);
		((Coffee) menu[0][1]).setMilkMl(100);
		((Coffee) menu[0][1]).calculatePrice();
		
		addProduct(new Coffee("Americano"));
		((Coffee) menu[0][2]).setWaterMl(120);
		((Coffee) menu[0][2]).setCoffeeGr(7);
		((Coffee) menu[0][2]).setSugarGr(7);
		((Coffee) menu[0][2]).calculatePrice();
		
		addProduct(new Coffee("Capuccino"));
		((Coffee) menu[0][3]).setWaterMl(60);
		((Coffee) menu[0][3]).setCoffeeGr(14);
		((Coffee) menu[0][3]).setSugarGr(7);
		((Coffee) menu[0][3]).setMilkMl(150);
		((Coffee) menu[0][3]).calculatePrice();
		
		addProduct(new Coffee("Mocaccino"));
		((Coffee) menu[0][4]).setWaterMl(50);
		((Coffee) menu[0][4]).setCoffeeGr(14);
		((Coffee) menu[0][4]).setSugarGr(14);
		((Coffee) menu[0][4]).setMilkMl(100);
		((Coffee) menu[0][4]).setChocolateGr(50);
		((Coffee) menu[0][4]).calculatePrice();
		
		
		addProduct(new Tea("Black tea"));
		addProduct(new Tea("Green tea"));
		addProduct(new Tea("Black bergamot"));
		((Tea) menu[1][2]).setBergamot(true);
		addProduct(new Tea("Lemon Tea"));
		((Tea) menu[1][3]).setLemon(true);
		addProduct(new Product("Bread", 0.5));
	
		
	}
	
	
	void printMenu() {
		System.out.println();
		System.out.println("---------------------- Menu -----------------------------------------");
		System.out.println("Name                  Ingridients                               Price");
		System.out.println("---------------------------------------------------------------------");
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
	void removeProduct(String productName){
		Product p;
		boolean found = false;
		for (int i = 0;i<3;i++){
			if (menu[i] !=null){
			for (int k = 0;k < menu[i].length;k++){
				p = menu[i][k];
				if (p.name.equals(productName)){
					found = true;
					Product[] newProduct = new Product[menu[i].length-1];
					System.arraycopy(menu[i], 0, newProduct, 0, k);
					System.arraycopy(menu[i], k+1, newProduct, k, menu[i].length-k-1);
					menu[i] = newProduct;
					System.out.println();
					System.out.println("Item " + productName + " removed");
					}
			}
			}
		}
		if (!found) {
			System.out.println(productName + " not found, can't remove");
		}
	}
	
	void changePrice(String productName,double newPrice){

		boolean found = false;
		for (int i = 0;i<3;i++){
			if (menu[i] !=null){
				for (Product p:menu[i]){
					if (p.name.equals(productName)){
						found = true;
						p.setPrice(newPrice);
						System.out.println();
						System.out.println("Price for " + productName + " changed to " + newPrice + "$");
					}
				}
			}
		}
		if (!found){
			System.out.println(productName + " not found, can't change price");
		}
	}
}

package business_site;

import java.util.*;

public class SmallShop {

	public void Shop() {
		Scanner sc = new Scanner (System.in);
		ProductList ArrayList = new ProductList();
		int operations = 100000;
		
		for(int i = 1 ; i <= operations ; i++) {
			System.out.println("Enter Operation Number: ");
			
			int number = sc.nextInt();
			int name, buy_price, sell_price, count;
					
			if (number == 1) {
				//Add a product into ProductList
				System.out.println("Enter the product name(int): ");
				name = sc.nextInt();
				System.out.println("Enter Buy price: ");
				buy_price = sc.nextInt();
				System.out.println("Enter Sell price: ");
				sell_price = sc.nextInt();
				System.out.println("Available number in the inventory to sell: ");
			        count = sc.nextInt();
		
				ArrayList.add(name, buy_price, sell_price, count);		
				System.out.println("The Product is added into the Product List!");
			}
			
			else if(number == 2) {
				// Delete a Product
				
				System.out.println("Enter the name of the product that want to delete: ");
				name = sc.nextInt();
				ArrayList.delete(name);
			}
			
			else if(number == 3) {
				// Buy product
				
				System.out.println("Enter the product name that want to buy: ");
				name = sc.nextInt();
				System.out.println("Enter the amount of product that want to buy: ");
				int amount = sc.nextInt();
				
				ArrayList.buy(name, amount);
				
			}
			
			else if(number == 4) {
				// Sell Product 
				
				System.out.println("Enter the product name that want to sell: ");
			        name = sc.nextInt();
				System.out.println("Enter the amount of product that want to sell: ");
				int amount = sc.nextInt();
				
				ArrayList.sell(name, amount);
			}
			
			
			else if(number == 5) {
				// Show the product list
				
				System.out.println("Available product list:\n");
				ArrayList.showList();
			}
			
			else if(number == 6) {
				// check available balance
				
				System.out.println("Total balance: "+ProductList.balance);
			}
			
			else {
				System.exit(0);
			}
				
		}
	}
}

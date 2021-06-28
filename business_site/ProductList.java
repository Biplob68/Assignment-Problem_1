package business_site;

import java.util.ArrayList;

public class ProductList {
	
	
	static int balance = 0; //Initially total balanced is 0
	
	private ArrayList <Products> products = new ArrayList<Products> (); // ArrayList to store the Product
	
	
	int i; 
	
	ProductList() {
		products.clear();
	}

	
	// Method for add product 
	public void add(int productName, int buyPrice, int sellPrice, int availableProductNum){
		Products newProduct = new Products(productName, buyPrice, sellPrice, availableProductNum);
		products.add(newProduct);
	}
	
	
	// Method for Delete Product
	public void delete(int productName) {
		
		if(products.size() == 0) {
			System.out.println("The Product list Empty! So Not possible to delete product!");
			return;
		}
		
		int flag = -1;
		// To search the product
		for(i = 0 ; i <products.size(); i++) {
			Products p = products.get(i);
			if(p.getproductName() == productName) {
				flag = i;
				break;
			}
		}
		if(flag != -1) {
			products.remove(flag); 
			System.out.println("Products " + productName + " is deleted!");
		}
		else {
			System.out.println("The Product is not in the Product List!");
		}
	}
	
	
	
	// Method for buy product 
	public void buy(int productName, int number) {
		//  When a product is bought the amount is added 
		for(i = 0 ; i <products.size() ; i++) {
			Products p = products.get(i);
			if(p.getproductName() == productName) {
				p.addProduct(number); 
				products.set(i, p); // Add new product of the product list
				 
				// reduce total cost
				balance -= number * p.getbuyPrice();
				System.out.println("The Product is bought!");
				break;
			}
		}
	}
	
	
    // Method for sell product 
	public void sell(int productName, int number) {
		
		for(i = 0 ; i <products.size(); i++) {
			Products p = products.get(i);
			if(p.getproductName() == productName) { 
				//profit from sell
				int Profit = number * (p.getsellPrice() - p.getbuyPrice()); 
				
				p.sellProduct(number); // reduce total product number
				p.updateProfit(Profit); // Update Profit
				
				// adding the sell price
				balance +=number*p.getsellPrice();
				System.out.println("The Product is sold!");
				
				products.set(i, p); // update new product list
				return;
			}
		}
	}
	
	
	// Method to print the entire product list
	public void showList() {
		int i, l = products.size();
		for(i = 0 ; i <l ; ++i) {
			Products product = products.get(i);
			product.getproductName();
			product.getbuyPrice();
			product.getsellPrice();
			
			System.out.println("Product number: " + (i + 1));
			product.displayproductInfo();
			
			System.out.println(" ");
		}
		
	}
	
	

}

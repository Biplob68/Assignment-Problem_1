package business_site;

public class Products {
	

	private int productName, buyPrice, sellPrice, availableProductNum, totalProfit;
	
	//A constructor to set Product informations 
	Products(int productName, int buyPrice, int sellPrice, int availableProductNum){
		this.productName = productName;
		this.buyPrice = buyPrice;
		this.sellPrice = sellPrice;
		this.availableProductNum = availableProductNum;
		totalProfit = 0;      // Initially total profit is Zero
		
	}
	
	//Get method that return the product name
	public int getproductName() {
		return productName;
	}
	
	//Get method that return the buying price of a product
	public int getbuyPrice() {
		return buyPrice;
	}
	
	
	public int getsellPrice() {
		return sellPrice;
	}
	
	
	public int availableProduct() {
		return availableProductNum;
	}
	
	
	public int getProfit() {
		return totalProfit;
	}
	
	
	//Update the profit when we sell a product
	public void updateProfit(int number) {
		totalProfit += number;
	}
	
	//Add number when product is added
	public void addProduct (int number) {
		availableProductNum += number;
	}
	
	//Reduce number if product is sold
	public void sellProduct(int number) {
		availableProductNum -= number;
	}
	
	
	public void displayproductInfo() {
		// A method to return the whole product information
	
		System.out.println("product Name: " +productName);
		System.out.println("Buy Price: " +buyPrice);
		System.out.println("Sell Price: " +sellPrice);
		System.out.println("Available number in the inventory: " +availableProductNum);
		System.out.println("Total profit " +totalProfit);
	}

}

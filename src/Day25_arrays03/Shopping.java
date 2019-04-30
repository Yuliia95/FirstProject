package Day25_arrays03;

public class Shopping {
	public static void main(String[] args) {
		
	String [] products = {"Timberland Shoes", "H&M Shirt", "SWatch Watch", "Gucci Bag", "Adidas socks"};
	double [] prices = {120.0, 5.99, 150, 3000.5, 6.99};
	
	int [] itemsId = {12345, 12346, 12347, 12348, 12349};
	
	
	
	System.out.println("Products count: "+ products.length);
	//check if products, prices and itemsId have same count 
	
	if(products.length == prices.length && products.length == itemsId.length) {
		System.out.println("Shopping list looks good");
	}else {
		System.out.println("Something is wrong in this list");
	return;
	}
	//loop though products and print each one in separate line 
	
	for(String p : products) {
		System.out.println(p);
	}
	
	//prices --> for loop 
	for(int i = 0; i < prices.length; i++) {
		System.out.println(prices[i]);
	}
	
	//itemsId --> print this in reverse order
	
	System.out.println(itemsId[itemsId.length-1]);
	for(int i = itemsId.length-1;i>=0 ; i--) {
		System.out.println(itemsId[i]);
	}
	//print the report. with a total price
	//Item 1: 12345 - Timberland shoes - $120.0
	//......
	//Total price:
	System.out.println("##### YOUR SHOPPING RECEIPT #####");
	double totalPrice = 0.0;
	for(int i = 0; i < products.length; i++) {
		                  //Item 1: 12345 - Timberland shoes - $120.0
	System.out.println("Item "+(i+1) + ": "+itemsId[i]+" - "+ products[i]+" - $"+ prices[i]); 
	totalPrice += prices[i];//calculate total price of all items
	}
	System.out.println("Total Price: $"+ totalPrice);
	

 //Find the most expensive item in your list and print it as a report 
 //loop and find.Do not use Arrays class
	
	int maxIndex = 0;
	double maxPrice = 0.0;
	
	for(int j = 0;j<prices.length; j++) {
		if(prices[j] > maxPrice) {
			maxPrice = prices[j];
		maxIndex = j;
		}
	}
System.out.println(itemsId[maxIndex]+ " - "+ products[maxIndex] + " - $"+ maxPrice);
 
//Homework - find the chippest item !!!	
System.out.println("#####");
int minIndex = 0;
double minPrice = 0;

for(int i = 0; i < prices.length; i++) {
	if(prices[i] < minPrice) {
		minPrice = prices[i];
		minIndex = i;
	}
	}
System.out.println(itemsId[minIndex]+ " - "+products[minIndex]+ " - $"+minPrice);
	
}
	}



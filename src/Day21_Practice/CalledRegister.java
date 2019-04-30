package Day21_Practice;
import java.util.Scanner;
public class CalledRegister {
	public static void main(String[] args) {
	Scanner keyboard  = new Scanner(System.in);	
	
	System.out.println("How many items are you purchasing today? ")	;
	
	int itemsCount = keyboard.nextInt();
	double totalPrice = 0.0;	
	String items = "";
	
	for(int count = 1; count <= itemsCount;count++) {
		System.out.println("What is item "+count+ "?");	
	String itemName = keyboard.next();
	
	System.out.println("How much is " +itemName + "?");
	double itemPrice = keyboard.nextDouble();
	// add itemName to items and itemPrice to totalPrice 
	items += itemName + ",";
	totalPrice += itemPrice;
	}
	
	System.out.println("Your items: "+items);
	System.out.println("Your total Price: $" + totalPrice);
	
	
	
	}

}

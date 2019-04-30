package Day18_while_dowhile_loops;
import java.util.Scanner;
public class EnterPincode {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		 int secretPincode = 1234;
		  int pincode = 0;
		  
		  //keep asking for the pincode until correct one entered
		   while(pincode != secretPincode) {
			   System.out.println("Enter pincode: ");
			  pincode = scan.nextInt();
		   }
			   
		   System.out.println("Acces granted, select operation") ;  
			   
			   
		//Acces granted, select operation	   
		
	}

}

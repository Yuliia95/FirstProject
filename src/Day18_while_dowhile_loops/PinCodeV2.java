package Day18_while_dowhile_loops;
import java.util.Scanner;
public class PinCodeV2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
	 int secretPincode = 4321;
	 
	 //give only 3 attemps
	 //if attemps reaches more than 3, print card blocked
	 
	int pincode = 0;
	int attemps = 0;
	
	while(pincode != secretPincode && attemps <= 3) {
		System.out.println("Enter pincode");
		pincode = scan.nextInt();
		attemps++;
		if(attemps == 3 && pincode !=secretPincode ) {
			System.out.println("card is blocked");
			return;// stop execution
		}
	}
	
	System.out.println("acces granted.Select operation");
	
	
	
	}

}

package Day22_loopspractice2;
import java.util.Scanner;
public class ValidMonth {
	public static void main(String[] args) {
		Scanner keyboard  = new Scanner(System.in);
		
		int month;
		
	do {
		System.out.println("Enter month: ");
		month = keyboard.nextInt();
	}while(month >= 1 && month <= 12);
	
	System.out.println("Invalid Month - "+month);
	}
	
}
//for(int month = 1; month <= 12;month++ ) {
		//System.out.println("Enter month: ");
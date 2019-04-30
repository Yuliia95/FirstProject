package Day33_ReturnMethod;
import java.util.*;
public class Calculator {
	public static void main(String[] args) {
		
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter your hours for this week: ");
	int hour = scan.nextInt();
	System.out.println("Whats your rate per hour MAM? ");
	int rate = scan.nextInt();
	int pay = getHourlyPay(hour, rate);

	System.out.println("Your total pay for this week is: $" + pay + " after tax");

}

public static int getHourlyPay(int hours, int rate) {
	int totalPay = hours * rate;
	if (hours <= 0) {
		System.out.println("Invalid hours");
		return 0;
	}
	if (hours <= 0) {
		System.out.println("Invalid rate");
		return 0;
	}
	return totalPay;
}
}




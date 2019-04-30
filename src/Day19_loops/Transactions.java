package Day19_loops;
import java.util.Scanner;
public class Transactions {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("What is your current balance?");
		double balance = scan.nextDouble();
		int count = 0;
		while (balance >0) {
		count++; //meaning increase transaction by 1
		 System.out.print("What is transaction #"+count+ "amount?");
		double transaction = scan.nextDouble();
			//balance = balance - transaction;
	if(transaction > balance) {
	System.out.print("Your balance is about to be negative due to this transaction");
	continue;// meaning it will go on the top of the loop right away 
	}
		balance -= transaction;	
        System.out.println("Current balance: "+balance);
}
		System.out.println("You have insuficient funds, your balance is: "+balance);
		System.out.println("transaction total count: " +count);	
		
	}

}
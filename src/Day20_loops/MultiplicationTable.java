package Day20_loops;
import java.util.Scanner;
public class MultiplicationTable {
	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);	
	System.out.println("Enter number: ");
	int num = scan.nextInt();
	//check if it is valid.
	//if it not valid return
	if(num < 1 || num > 10) {
		System.out.println("ERROR invalid input");
		return;// stop execution
	}
	for(int i = 1; i <= 10; i++) {
	//	int result = num * i; the other way how to calculate 
		System.out.println(num+ " x "+i+" = "+(num*i));
	}

		
	}

}

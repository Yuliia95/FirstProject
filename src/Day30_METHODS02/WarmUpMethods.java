package Day30_METHODS02;
import java.util.*;
public class WarmUpMethods {
	public static void main(String[] args) {
		
		print5Star();// call the method 	
		//call  print5Star 100 times 
		for(int i =0; i<= 100; i++) {
			print5Star();	
		}	
		introduce() ;
	}
	
	public static void print5Star() {
		
	System.out.println("* * * * *");	
		
	}
	public static void introduce() {
		Scanner scan = new Scanner(System.in);
		System.out.println("What is your name?");
		String name = scan.next();
	System.out.println("Nice to meet you, "+name);
	}


}

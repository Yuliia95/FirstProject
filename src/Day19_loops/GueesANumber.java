package Day19_loops;
import java.util.Scanner;
public class GueesANumber{ 
	 public static void main(String[] args) {
	        Scanner scan = new Scanner(System.in);
	   
	        System.out.println("### WELCOME TO GUESS A NUMBER GAME ###");
	        //this will give us a number between 0 - 100
	        int secretNumber = 83;
	        int guessNumber;
	        
	        do {
	            System.out.println("Guess a number:");
	            guessNumber = scan.nextInt();
	            if(guessNumber<secretNumber) {
	                System.out.println("Your number is too small");
	            }else if(guessNumber>secretNumber) {
	                System.out.println("Your number is too large");
	            }
	        }while(guessNumber!= secretNumber);
	        
	        System.out.println("Bingo, you won!!!");
	        
	        

	    }

	}	
		
	
	
	
	

	
	
	
	
	
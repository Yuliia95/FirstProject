package Day11;
import java.util.*;
public class CalculatorSwithcMethod {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter first number:");
		double num1 = scan.nextDouble();
		System.out.println("Enter second number:");
		double num2 = scan.nextDouble();
		//Get operator
		System.out.println("Select Operator: +, -, *, %");
		
		String operator = scan.next();
		double result;
		
		switch(operator) {
		  case "+":
			  result = num1 + num2;
			System.out.println("Result");
			break;
			
		  case "-":
			  result = num1 - num2;
			  System.out.println("Result");
		  break;
		  
		  case "*":
		  result = num1 * num2;
		  System.out.println("Result");
	       break;

		  case "%":
		  result = num1 % num2;
		  System.out.println("Result");
	      break;
	      
		  case "/":
		  result = num1 / num2;
		  System.out.println("Result");
	      break;
	      
		default:
			System.out.println("Invalid operator selected: "+ operator);

		
		}
		
	
		
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

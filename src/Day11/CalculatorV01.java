package Day11;
import java.util.*;
public class CalculatorV01 {
public static void main(String[] args) {
	
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter first number:");
	double num1 = scan.nextDouble();
	System.out.println("Enter second number:");
	double num2 = scan.nextDouble();
	//Get operator
	System.out.println("Select Operator: +, -, *, %");
	
	String operator = scan.next();
	double result = 0.0;
	
	// perform calculation and display result 
	
	if(operator.equals("+")) {
		result = num1 + num2;
	}else if(operator.equals("-")) {
		result = num1 - num2;
	}else if(operator.equals("*")) {
		result = num1 * num2;
	}else if(operator.equals("%")) {
		result = num1 % num2;
	}else if(operator.equals("/")) {
		result = num1 / num2;
	}else {
		System.out.println("Invalid operator selected: "+ operator);
		return;// Do not execute the remaining code. STOP HERE!
	}
	
	System.out.println("result: " + result);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}

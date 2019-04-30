package day05_math_operators;

public class ArithmeticOperators {
	public static void main(String[] args) {
		
		// = - Addition opertor
		System.out.println(55 + 5);	
		
		int chairs = 140;
		System.out.println(chairs + 2);
		
		
		int moreChairs = chairs + 5;
		System.out.println(moreChairs);
		
		int tables = 130;
		int total = tables + chairs;
		
		System.out.println(total);
		
		// - Subtraction. Minus example:
		System.out.println(500-123);
		int result = 44 - 23;
		System.out.println(result);
		
		double balance = 1200.50;
		double transaction = 56.44;
		System.out.println(balance-transaction);
		
		//create a variable linesOfCode and assign 50 and print "Lines of code 50"
		// you deleted 2 lines
		//decrease the value of linesOffCode by 2 and print "Lines of codes 48"
		
		int LineOfCode = 50;
		System.out.println("Lines of code " + LineOfCode);
		
	    LineOfCode = LineOfCode -2;
	    System.out.println("Lines of codes " + LineOfCode);
	    
	    //Multiplication *
	    System.out.println(22 * 2);
	    
	    //declare variables classes and assign 5 
	    
	    int classes = 5;
		System.out.println(LineOfCode * classes);
		
		int totalLineOfCode = LineOfCode * classes;
		//totalLinesOfCode=240
		
		System.out.println("totalLineOfCode = " + totalLineOfCode);
		
		
		//DIVISION operator //
		System.out.println(10/3); // 3
		System.out.println(55/5); // 11
		System.out.println(10.0/3); // 3.3333333333333335
		System.out.println(15/7); // 2
		System.out.println(15.0/7); // 2.142857142857143
		System.out.println(5.0/2.0); // 2.5
		
		
	// Two whole numbers will always give you the result with the whole number
	//if it;s going to be #.# ex: 2.3 - will always give you the result with 3.4
		
		System.out.println(11/0); // In Java when you divide by 0 it will compile 
		//(Translate). But when code is running, java will throw/show error
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
	}

}

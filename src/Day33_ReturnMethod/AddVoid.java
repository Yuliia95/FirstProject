package Day33_ReturnMethod;

public class AddVoid {
	public static void main(String[] args) {
	addVoid(2,5);
	add(4,8);
	System.out.println(add(4,8));
	multiply(4,5);
	System.out.println(multiply(4,5));	
    minus(6,5);
	divide(6,4);
	}
	
//1) method addVoid	
	public static void addVoid(int num1, int num2) {
		int sum = num1 + num2;
		System.out.println("Sum: "+sum);
	}

	public static int add (int num1, int num2 ) {
		int sum = num1 + num2;
		return sum;
	}
	public static double multiply(double num1, double num2 ) {
		double result = num1 * num2;
	    return result;// or we can write it : return num1 * num2
	}	
	
	public static double minus(double num1, double num2 ) {
		double result = num1 - num2;
	    return result;
	}	
	
	public static double divide(double num1, double num2 ) {
		if(num2 == 0) {
			System.out.println("ERROR: Cannot / by 0");
		return 0;
	}else {
		double result = num1 / num2;
	return result;
	}	
	}
}


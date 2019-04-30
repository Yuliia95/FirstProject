package day07_scanner_operators;

public class Incrementors {
	public static void main(String[] a) {
		int initialNumber = 3;
		int afterResult = initialNumber++;
		int beforeResult = ++initialNumber;
		
		
	
		
		System.out.println(afterResult);
		System.out.println(beforeResult);
		
	}
	
	public static void main1() {
		int initialNumber = 3;
		int afterResult = initialNumber;
		initialNumber = initialNumber + 1;
		
		initialNumber = initialNumber + 1;
		int beforeResult = initialNumber;
		
	}
	
	public static void main1(String[] args) {
		int initialNumber = 16;//21
		int afterResult = initialNumber++ + ++initialNumber;
		//   34    
		int someResult = ++initialNumber;
		//    21
		int finalResult = someResult++ - ++someResult;
		//   -2       =            -       20
		// initialNumber = ?
		// afterResult = 
		// someResult = ? | initialNumber = ?
		// finalResult = ? | someResult = ?
		
		System.out.println(someResult);
		System.out.println(afterResult);
		System.out.println(someResult);
		System.out.println(finalResult);

		// 
	}
}

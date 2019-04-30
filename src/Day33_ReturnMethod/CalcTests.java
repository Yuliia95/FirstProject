package Day33_ReturnMethod;

public class CalcTests {
	public static void main(String[] args) {
		System.out.println(AddVoid.add(3, 1));
		System.out.println(AddVoid.multiply(5, 6));
		System.out.println(AddVoid.minus(40, 12));
		System.out.println(AddVoid.divide(100, 2));
	
	int addResult = AddVoid.add(21,41);
	double mResult = AddVoid.multiply(50, 40);
	double miResult = AddVoid.minus(3000, 200);
	double dResult = AddVoid.divide(455, 5);
	
	System.out.println("addResult: "+addResult);
	System.out.println("mResult: "+ mResult);
	System.out.println("miResult: "+miResult);
	System.out.println("dResult: "+dResult);
	
	double a = 10.0, b = 5.0;
	double myResult = AddVoid.minus(a,  b);
	System.out.println("myResult: "+ myResult);
	
	double[] dNums = {2.0, 4.0};
	double result2 = AddVoid.multiply(dNums[0], dNums[1]);
	System.out.println("result2: "+result2);
	
	if(AddVoid.add(10, 16) == 26) {
		System.out.println("Add Unit Test Passed");
	}else {
		System.out.println("Add Unit test failed");
	}
	String str = "java";
	if(str.length() == 4) {
		System.out.println("It is 4 characters");
	}else {
		System.out.println("It is not 4 characters");
	}
	
	}

}

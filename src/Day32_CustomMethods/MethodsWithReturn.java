package Day32_CustomMethods;

public class MethodsWithReturn {
	public static void main(String[] args) {
		System.out.println(giveMe10$());
	int i = giveMe10$();
	System.out.println("i: "+i);
	System.out.println(giveMeYourName());//1st way how to print it
	
	String myName = giveMeYourName();// 2nd way how to print it 
	System.out.println("MyName is "+myName);//2nd way how to print it 
	}
	
	/*
	 * this method, returns int value 
	 */
	
	
	public static int giveMe10$() {
		System.out.println("returning 10 from method");
		return 10;
	}

/*
 * giveMeYourName()
 * return type: String
 * Declare name variable and assign your name
 * then return it.Call in main method
 */

public static String giveMeYourName() {
	String name = "Yullia";
	return name ;// return "Yullia";
}

}

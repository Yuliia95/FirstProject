package Day29_methods;

public class Student {
	public static void main(String[] args) {
	sayHello();	
	study();
	study();
	code();	
	}

public static void study() {
	System.out.println("Student is studing");
}
//create method with name  sayHello. that prints "Hello Friends!"

 
public static void sayHello() {
	System.out.println("Hello Friends!");
	System.out.println("How are you today?");
}
//create a method with name code.
 public static void code() {
	 System.out.println("Inside code method"); 
	 System.out.println("Student is coding Java");
 }
}

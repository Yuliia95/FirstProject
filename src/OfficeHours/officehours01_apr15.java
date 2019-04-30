package OfficeHours;

public class officehours01_apr15 {
	public static void main(String[] args) {

	String day = "Monday";
	//check number of chars
	
	System.out.println(day.length());//6
	
	if(day.length() <= 6) {
		System.out.println("Possibly a valid day");	
	}else {
		System.out.println("Days are normally 6 chars or loger!");	
	}
	//compare strings
	String today = "Monday";//created in string pool
	
	if(day.equals(today)) {
		System.out.println("Monday is today");	
	}else {
		System.out.println("Wrong day");	
	}
	
	//day ==> Monday, Friday, Sunday 
	}
}
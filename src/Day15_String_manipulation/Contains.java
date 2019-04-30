package Day15_String_manipulation;

public class Contains {
	public static void main(String[] args) {
	String email = "test@gmail.com"	;
	System.out.println(email.contains("@"));
		
	String list = "potatoes, apples, tomatoes, eggs, milk, bread, cereal, meat"	;
	if(list.contains("apples")) {
		System.out.println("Apples are there");
	}else {
		System.out.println("Lets add apples now");
	}
	
	boolean hasEggs = list.contains("eggs");
	System.out.println("Contains eggs: "+hasEggs);
	
	boolean hasCucumbers = list.toLowerCase().contains("cucumbers");
	System.out.println("Contains cucumbers: " +hasCucumbers);	
		
		
	email = "name@yahoo.com";	
	if(email.contains("@hayoo")) {
		System.out.println("Yahoo account");
	}else if(email.contains("agmail")) {
		System.out.println("Gmail account");
	}else if(email.contains("@hotmail")){
		System.out.println("Hotmail account");	
				
	}			
		
	String etsyTitle = "Wodden spoon | Etsy";
	if(etsyTitle.contains(" | ")) {
		System.out.println("Pipe is there as expected");
	}else {
		System.out.println("Pipe is not detected");
	}
// Assign you name and check if it contains "a" or "e" letter
	
	String name = "Yuliia";
	if(name.contains("a") || name.contains("e")) {
	System.out.println(" 'a' or 'e' are not contain in my name");
   }else {
	   System.out.println("invalid letters");
   }
}
}
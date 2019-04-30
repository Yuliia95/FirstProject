package day14_String_Manipulations;

public class CahrAt {
	
	public static void main(String[] args) {
		
	String word = "Computer";	
System.out.println(word.length());// will show us how many character we have in word "Computer";
		// print all character one by one 
	System.out.println(word.charAt(0));
	System.out.println(word.charAt(1));
	System.out.println(word.charAt(2));
	System.out.println(word.charAt(3));
	System.out.println(word.charAt(4));
	System.out.println(word.charAt(5));
	System.out.println(word.charAt(6));
	System.out.println(word.charAt(7));
	System.out.println(word.charAt(8));
	System.out.println(word.charAt(9));
	

		String word2 = "Java";{
				
		if(word2.charAt(0) == 'J') {
			System.out.println("J is first char");
		}else {
			System.out.println("J is not first char");
		}
		
		//String word that consist of 5 characters
		
		
		String word3 =  "civic";
		char first = word3.charAt(0);
		char last = word3.charAt(4);
		if(first == last) {
			System.out.println("First and last match");
		}else {
			System.out.println("Do not match");
		}
		
		// String word4 => always print the last character
		// no matter the length
		
		String word4 = "Automation";
		char LastChar = word4.charAt(word4.length()-1);
		System.out.println("Last value of " +word4+ " is "+ LastChar);
		
	

		
	

}
}
}
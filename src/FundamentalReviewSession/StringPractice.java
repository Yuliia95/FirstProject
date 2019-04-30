package FundamentalReviewSession;

public class StringPractice {
	public static void main(String[] args) {
	    //leteral - way to create a String 
		String word = "java";
		word = word.toUpperCase();
		
	
	//another way how to create the String
		String word2 = new String("java");
		word2 = word2.toUpperCase();
		System.out.println(word);
		System.out.println(word2);
	
		System.out.println(word == word2);
		//equals method check value 
		System.out.println(word.equals(word2));
	
	}
}

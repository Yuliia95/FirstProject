package Day31_METHODS03;

import java.util.Arrays;

public class MethodsWithStrings {
	public static void main(String[] args) {
	
		countWords("java is fun");
		countWords("this is method with strings");
		googleSearchResults("About 16,600,000 results (0.73 seconds)");
	String resultsStr = ("About 121,000,000 results(0.75 seconds)");
	googleSearchResults(resultsStr);
	}
	

public static void countWords(String sentence) {
	String[] words = sentence.split(" ");//will find each space and will create an array for each word
System.out.println("Words in this sentence "+ Arrays.toString(words));
System.out.println("Number or words: "+words.length);
}

public static void googleSearchResults(String result) {
	//split by space into array
	String[] words = result.split(" ");
	String count = words[1].replace(", ", "");
	String seconds = words[3].replace("(", "");		
	
	System.out.println("Result count: "+ count);
	System.out.println("Time in seconds: "+ seconds);
}


}

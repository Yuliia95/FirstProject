package Day28_arrays06_loop;

import java.util.Arrays;

public class ReverseSentece {
	public static void main(String[] args) {
	
		String sentence = "you are very interesting person";
		//split by space 
		String[] arrSentence = sentence.split(" ");
		//print the number of words in the sentence 
		System.out.println("Numer of words: "+arrSentence.length);
		//print the exact word of array
		System.out.println(Arrays.toString(arrSentence));

	 String 	reversed = "";
		
	for(int i = arrSentence.length-1; i>= 0; i--) {
		System.out.println(arrSentence[i]);	
	}
		
		
		
		
		
		
	}
}

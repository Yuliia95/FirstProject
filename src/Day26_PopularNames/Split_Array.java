package Day26_PopularNames;

import java.util.Arrays;

public class Split_Array {
	public static void main(String[] args) {
		String words = "java,kava,html,selenium";
		String[] wordsArray=words.split(",");
	System.out.println("Count: "+wordsArray.length);
	//print one by one 
	System.out.println("#########");
	System.out.println(wordsArray[0]);
	
	System.out.println("#########");
	System.out.println(Arrays.deepToString(wordsArray));
	
	System.out.println("#########");
	for(String word : wordsArray) {
		System.out.println(word);
	}
	
	System.out.println("#########");
	String diceResult = "1 - 20 of 1,461 positions";
	
	//using split  method, print 1, 461
	String[] diceArray = diceResult.split(" ");
	
	System.out.println("Search result total: "+diceArray[4]);
	
	String[] diceArray2 = diceResult.split("of");
	System.out.println(diceArray2[0].trim());//using trim to remove spaces 
	System.out.println(diceArray2[1].trim());
	
	
	String sentence = "I felt happy because I saw the others were happy and because I knew I should feel happy, but I wasn’t really happy.";
	
	String [] allWords = sentence.split(" ");
	String[] happySplit = sentence.split("happy");		
	String[] ISplit = sentence.split("I");
	
	for(String w : allWords) {
		System.out.println(w);
	}
	System.out.println("AFTER HAPPY SPLIT");
	for(String w: happySplit) {
		System.out.println(w);
	}
	System.out.println("########");
	for(String w: ISplit) {
		System.out.println(w);
	}
	

	
			
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
}

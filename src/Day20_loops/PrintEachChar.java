package Day20_loops;

public class PrintEachChar {
	public static void main(String[] args) {
		String word = "Wooden Spoon";
		//using for loop, print each char one by one 
		for(int i = 0; i < word.length();i++) {
		System.out.println(word.charAt(i));
		}
		
		//using for loop, print only consonants
		
		
		
		//using for loop, print only vowel (a,e,o,i,u)

		for(int i = 0; i < word.length();i++) {
		char letter = word.toLowerCase().charAt(i) ; 
		if(letter == 'a' || letter == 'e' || letter == 'o'
					|| letter == 'i' || letter == 'u'){
			
		System.out.println(letter + ", ");
			}
		
	}
}
}
package Day21_Practice;
import java.util.Scanner;
public class GetUniqueCharacters {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter word");
		String word = scan.next();
		String unique = "";
		
 for(int i = 0; i < word.length(); i++) {
	char letter = word.charAt(i);
	//System.out.print(letter);
	if(!unique.contains(""+letter)) {
		unique += letter;
	}
}
		
 System.out.println(unique);	
		
		
		
		
//		for(int i = 0; i < word.length(); i++) {
//			System.out.print(i);//print 1, it increase
//			System.out.println(word.charAt(i));	
//		}
		

	
	
	
	
	
	}
}

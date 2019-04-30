package Assignments;
import java.util.*;
public class Ass102 {

	public static void main(String[] args) {
	    Scanner input = new Scanner(System.in);
	    String sentence = input.nextLine();
	    
	    
	    char[] chars = sentence.toCharArray();
	    for(int i = chars.length-1; i>=0; i--){
	      sentence+=chars[i];
	    }
	    System.out.println(sentence);
	  }
	}


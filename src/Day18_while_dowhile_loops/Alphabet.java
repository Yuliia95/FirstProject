package Day18_while_dowhile_loops;

public class Alphabet {
	public static void main(String[] args) {
		char letter = 'a';
		//System.out.println(letter);
		//letter++;
		//System.out.println(letter);	
		//letter++;
		//System.out.println(letter);	
		//letter++;
	  while ( letter <= 'z') {
		 System.out.print(letter+ " ");
		letter++;
		 
	 }
		// lets try with Upper Case letters
	  char capitals = 'A';
	  
	  while(capitals <= 'Z') {
		  System.out.println(capitals+ " ");
		  capitals++;
	  }
	  
	 //print lowercase in reverse
	  char letter1 = 'z';
	  while(letter1 >= 'a') {
		  System.out.print(letter1+ ", ");
	  letter1--;
	  
	}

	/*
	 A
	 AB  
	 ABC  
	 ABCD 
	 ABCDE
	 ABCDEF
	 ABCDEFG  
	 */
	//String letters = "";
	//letters = letters + 'A';
	// System.out.println(letters);
	  
	// letters = letters + 'B';
	 //System.out.println(letters);
	 
	 //letters = letters + 'C';
	// System.out.println(letters);
	 
	// letters = letters + 'D';
	// System.out.println(letters);
	 
	// letters = letters + 'E';
	// System.out.println(letters);
	 // we can do it in this way or we can use loops
	 
	 System.out.println();
	 String letters = "";
	 char myLetter = 'A';
		
	 while(myLetter <= 'Z') {
		 letters = letters + myLetter;
		 System.out.println(letters); 
		myLetter++; 
	 }
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
}

}
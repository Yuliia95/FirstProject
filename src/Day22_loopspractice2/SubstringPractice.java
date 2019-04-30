package Day22_loopspractice2;

public class SubstringPractice {
	public static void main(String[] args) {
		
	String word = "java";
	System.out.println(word.substring(0,2));
		
	//print each character in separate line using substring, no loop needed
	
	System.out.println(word.substring(0,1));
	System.out.println(word.substring(1,2));	
	System.out.println(word.substring(2,3));	
	System.out.println(word.substring(3));
	System.out.println();	
	
	int i = 0;	
	System.out.println(word.substring(i, i+1));
	i++;
	
	System.out.println(word.substring(i, i+1));
	i++;
	
	System.out.println(word.substring(i, i+1));
	i++;
	
	System.out.println(word.substring(i, i+1));
	i++;
	
	System.out.println("####################");
	
	for(int n = 0; n <= 3; n++) {
	System.out.println(word.substring(n, n+1));
	
	}
	
	System.out.println("####################");
	
//print letters in reverse 
	//a
	//v
	//a
	//j
	for(int n = 3; n >= 0; n--) {
		System.out.println(word.substring(n, n+1));
	}

	
	int start = 1;
	int end = 5;
	              //01234567891011
	String word2 = "UnitedStates";
	System.out.println(word2.substring(start, end));
	System.out.println(word2.substring(2,3));//i
	System.out.println(word2.substring(6,7));//S
	//pas single input.strt only and will include until last character
	System.out.println(word2.substring(6));//States
	//print last character using substring
	
	              //01234
	String word3 = "apple";
	System.out.println(word3.substring(word3.length()-1));
	
	}
}
















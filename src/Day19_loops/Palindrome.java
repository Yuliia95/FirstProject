package Day19_loops;

public class Palindrome {
	public static void main(String[] args) {
	String word = "level";
	String reversed = "";
	//loop through word in reverse order and
	//concetanate each character to reversed string
	  
	int idx = word.length()	-1;
	while (idx >= 0) {
	 reversed = reversed + word.charAt(idx);
	 idx--;
	}	
	System.out.println(reversed);	
	//compare if word and reversed are equal 
	if(reversed.equalsIgnoreCase(word))	{
		System.out.println("It is palindrome");	
	}else {
		System.out.println("It is not palindrome");
	}
	}

}
//int idx2 = word.length() - 1;
//while(idx2 >= 0) {
	//System.out.println(word.charAt(idx2));
	//idx2--;
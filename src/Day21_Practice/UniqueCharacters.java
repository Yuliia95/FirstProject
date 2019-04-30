package Day21_Practice;

public class UniqueCharacters {
	public static void main(String[] args) {
		String word = "javva";
		String unique = "";

	char ch = word.charAt(0);//first character of word "j
	System.out.println(unique.contains(""+ch));
	if(!unique.contains(""+ch)) {
		unique += ch;// unique = unique+ch;
	}
	if(unique.indexOf(ch) == 1) {
		unique+=ch; // "ab"
	}
	
	System.out.println("Unique:"+unique);
	
	//=========================================
	
	String word2 = "bananas";
	String unique2 = "";
	
	int i = 0;
	
	char ch2 = word2.charAt(i);//b
	System.out.println("Ch2:"+ch2);
	
	i = 1;
	ch2 = word2.charAt(i);//a
	System.out.println("Ch2:"+ch2);
	
	//check if ch2 is in the unique2 variable 
	
	if(unique2.contains(""+ch2));
	
	
	
	
	
	
	}

}

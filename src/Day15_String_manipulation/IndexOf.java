package Day15_String_manipulation;

public class IndexOf {
	public static void main(String[] args) {
		          //012345
	String word1 = "github"	;
	System.out.println(word1.indexOf('g'));
	System.out.println(word1.indexOf("th"));
	
	String title = "Java - Google Search";
	// find position of '-' and check if space
	//is on right and left sides 
		int dash = title.indexOf('-');//5
		System.out.println(title.charAt(dash-2));// " "
		System.out.println(title.charAt(dash+2));
		
		String country = "United States of America";
		int states = country.indexOf("States");// 7
		System.out.println("Position of states: " +states);
		
		String word2 = "java, c++, python, tomcat, eclipse";
		// check if c++ is in the word2
		//1) using contains
		
		if(word2.contains("c++")) {
			System.out.println("c++ is there");
		}else {
			System.out.println("c++ is not there");
		}
	
	// 2) using indexOf
	if(word2.indexOf("c++") != 1) {
	System.out.println("c++ is there");
	}else{
	System.out.println("c++ is not there");	
	
	}
	}

}

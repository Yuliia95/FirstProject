package Day16;

public class ReplaceThem {
	public static void main(String[] args) {
	String sentence = "Coding is fun, it is my hobby!!";
	String withNoSpaces = sentence.replace(" ", "")	;
	System.out.println(withNoSpaces);
	
	System.out.println(sentence);
	//replace , with !!!
	sentence.replace(",", "!!!");
	System.out.println(sentence);	
	
	String mixed = "$#java-#$";
	//clean up mixed and print only "java"
	mixed = mixed.replace("$#", "");
System.out.println(mixed);
	mixed = mixed.replace("-#$", "");
	System.out.println(mixed);
	//another way we can combine it:
	//mixed = mixed.replace("$#", "").replace("-#$", "");
	System.out.println(mixed);
	
	mixed = mixed.replace("a", "");
	System.out.println(mixed);
	
	String result = "About 115,000,000 results (0.59 seconds)";
	
	//using sting methods = replace, get number of results 
	//115,000,00
	result = result.replace("About", "");
	//result = result.replace("results (0.59 seconds)", "");-might break if number will change
	
	result = result.substring(0,result.indexOf(" "));
	System.out.println(result);
	
	}

}

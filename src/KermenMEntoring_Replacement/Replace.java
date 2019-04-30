package KermenMEntoring_Replacement;

public class Replace {
	public static void main(String[] args) {
		
	String word ="HGDGfd84hbfh8vsv"	;
	
	System.out.println("Before: "+word);
	System.out.println("After remove all letters: "+word.replaceAll("[a-zA-Z]", ""));
	System.out.println("After remove all numbers: "+word.replaceAll("[0-9]", ""));	
	
	//3.replaceFirst method
	
	//Example for replaceFirst
	
	String str = "Great weather today.";
	
	System.out.println("Before: "+str);
	System.out.println("After replaceFirst: "+str.replaceFirst("t", "9"));
	
	String r = "one fish, two fish.";
	System.out.println("Before: "+r);
	System.out.println("After: "+r.replaceFirst("fish", "cat"));
	
	
	}

}

package MyMentoringSession_May8th;

public class MethodsWithString_BiggerString {
	public static void main(String[] args) {
	
	System.out.println(biggerS("apple", "orange"));
	System.out.println(biggerS("pineaple", "mango"));
	
	}

/*
 * Create a String method: biggerS
 that gets two strings "a" and "b" 
 and return the longest one

 */
 public static String biggerS(String a ,String b){
		   if(a.length() > b.length()){
		 return a;
		}else if(b.length() > a.length()){
		  
		  
		}  
		return b;


	}
}

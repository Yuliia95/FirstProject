package MyMentoringSession_May8th;

public class Sign {
	public static void main(String[] args) {
	
	sign(6);
	sign(-9);
	sign(0);
	
	}

/*create an method: sign
declare 1 int n
sign function is to get a number and tell you if its positive, negative or zero.
print out 1,-1 or 0 depending on the input 	
 */
	
	public static void sign(int n){
	    if(n>=1) {
	      System.out.println("1");
	    }else if(n==0) {
	       System.out.println("0");
	    }else if(n<0) {
	       System.out.println("-1");// }else{ System.out.println("-1");
	 }
	          
	 }


}

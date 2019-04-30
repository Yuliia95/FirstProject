package Day16;
import java.util.Scanner;
public class Url {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);	
	System.out.println("Enter url: ");
		String url = scan.next();		
	// chech www.
		if(url.startsWith("www.")) {
		System.out.println(url+ " includes www.");
	}else {
			System.out.println("url doesn't contain www.");
		return;
	}	
		//check . is there right before extension.
		// find out the length of the yrl
		// do -4 and using charAt get the character
		// compare if it is '.'.
		
		int dotIndex = url.length() - 4;
	   if(url.charAt(dotIndex) == '.'){
			System.out.println(". is there before extension") ;  
	   }else {
		   System.out.println(". might be misplaced");
	   }
		
	// get domain and extension
	   
	   String domain = url.substring(4, dotIndex);
	   System.out.println(domain);
		String extension = url.substring(dotIndex+1, url.length());
	System.out.println("extension: " +extension);
	
	
	}

}

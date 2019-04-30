package KermenMEntoring_Replacement;
import java.util.Scanner;
public class ReplaceWithScanner {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter source term:");
		String source = scan.nextLine();
		System.out.println("Enter search term: ");
		String search = scan.nextLine();
		System.out.println("Enter replace term: ");
		String replace = scan.nextLine();
		
		String result = source.replaceAll(search, replace);
		
		System.out.println(result);
		
		
		
		
		
		
		
		
	}
}

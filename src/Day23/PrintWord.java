package Day23;

public class PrintWord {
	public static void main(String[] args) {
		String word = "java";
		//update statement 
		for(int i = 0; i<word.length(); i++) {
		//condition
			if(word.substring(i, i+1).equals("a")) {
		//if condition is true, go back to	
		//update statement 		
				continue;
			}
			System.out.println(word.substring(i, i+1));
		}
	}

}

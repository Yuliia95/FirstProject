package Day16;

public class MakeOutWord {
	public static void main(String[] args) {
		String chars = "{{}}";
		String word = "java";
		String result = chars.substring(0,2) + word + chars.substring(2);
		System.out.println(result);
	}

}

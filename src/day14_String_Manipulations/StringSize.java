package day14_String_Manipulations;

public class StringSize {
	public static void main(String[] args) {
		String str1 = "Good Morning";
		// check if it matches "Good Morning" and print match
		// or Not match
		if (str1.equals("Good Morning")) {
			System.out.println("Match");
		} else {
			System.out.println("Not Match");
		}

		if (str1.equalsIgnoreCase("good morning")) {
			System.out.println("Match - ignore case");

		} else {
			System.out.println("Not Match - ignore case");
		}
		// Convert to All uppercase and print

		System.out.println(str1.toUpperCase());
		System.out.println(str1);// it stays as old value. not uppercase
		str1 = str1.toUpperCase();
		System.out.println("After assignment: " + str1);

		// combine the above methods together
		// convert to all lowercase first then check if it equals("good morning")

		// asking to convert to lowercase good morning ==> good morning
		if (str1.toLowerCase().equals("good morning")) {
			System.out.println("Chained methods: match");
		} else {
			System.out.println("Chained methods: do not match");
		}
		// FIND OUT HOW MANY CHARACTERS IN THE STRING

		String myName = "Yuliia";
		System.out.println(myName.length());
		int length = myName.length();
		System.out.println("My name's length: " + length);

		// usernames must be exactly 8 characters.

		String userName = "YuliiaUS";
		if (userName.length() == 8) {
			System.out.println("Valid username");
		} else {
			System.out.println("invalid username, must be 8 characters");
		}
		// password must be at least 6 characters
		String password = "woodenSpoon";
		if (password.length() >= 6) {
			System.out.println("Valid password");
		} else {
			System.out.println("Invalid password");
		}

		int passwordLength = password.length();
		if (passwordLength < 6) {
			System.out.println("Valid password");
		} else {
			System.out.println("Invalid password");

		}

	}

}

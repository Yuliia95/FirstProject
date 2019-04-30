package Day31_METHODS03;

public class Authentication {
	public static void main(String[] args) {
		
	Login("mentoring@cybertekschool.com","mentor001");
	Login("jbgbbg", "mentor001");
}
/*
 * Name: Login
 * Return type: void
 * 2 String args/params: username,password
 * Inside the method:
 * validUsername = "mentoring@cybertekschool.com"
 * validPassword = "mentor001"
 * 
 *  if username and password match, print "Login Successful! Welsome to Okta"
 *  if not: "Sign in failed!"
 */


public static void Login(String username, String password) {
	
String validUsername = "mentoring@cybertekschool.com";
String validPassword = "mentor001";

if(username.equalsIgnoreCase(validUsername) && password.equals(validPassword)) {
	System.out.println("Login Successful! Welsome to Okta");
}else {
	System.out.println("Sign in failed!");
}
}








}

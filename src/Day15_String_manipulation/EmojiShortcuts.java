package Day15_String_manipulation;

public class EmojiShortcuts {
	public static void main(String[] args) {
    String emoji = ":)";
// ==, != check if it does not equal to 2 chars

if(emoji.length() != 2) {
	System.out.println("Invalid emoji");
	return;// stop execution
}
//if code reaches this point, then emoji is 2 chars
// get first and second chars and assign to variables
char first = emoji.charAt(0);
char second = emoji.charAt(1);

if(first == ':') {
	if(second == ')') ;
		System.out.println("smile");
}else if(first ==';') {
	if(second == '(') ;
	System.out.println("sad");	
	
}else if(first == '(') {
if( second == '/') ;
	System.out.println("upset");
}else if(first == ')'){
	if( second == 'p') ;
		System.out.println("playful");
}else {
	System.out.println("Unknown Emoji");
}if(first == ';') {
	if (second == ')') ;
		System.out.println("wink");
	}else if(second == '0') {
   
	}
}









}
	






package Day16;

public class GetNumberFromString {
	public static void main(String[] args) {
		
	String sentence = " I wrote [236] lines of code today";
	//assign to variable print the number between [and]
		
		//String number = "[236]";
		
		//System.out.println("I wrote "+number+ " lines of code today");
	int start = sentence.indexOf('[') +1;
	int end = sentence.indexOf(']');
	
	String codeCount = sentence.substring(start, end);
	System.out.println("Lines of code: "+codeCount);
	
	
	
//Check if codeCount is more than 20
int count = Integer.parseInt(codeCount);// convert String to int
if(count > 20) {
	System.out.println("wrote more than 20 lines of code Today");
}else {
	System.out.println("Not enough coding for today");
	
}
	}

}

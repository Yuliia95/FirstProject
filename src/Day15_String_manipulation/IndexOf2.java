package Day15_String_manipulation;

public class IndexOf2 {
	public static void main(String[] args) {
		// index of with 2 inputs
		
		String list = "ntml-selenium-angular-jenkins-grid ";
		int firstDash = list.indexOf("-");
		System.out.println("First dash: " +firstDash);
		
		int secondDash = list.indexOf("-", 5);
		System.out.println("second dash: "+ secondDash);
		// find the third one by using secondDash variable
		int thirdDash = list.indexOf("-", secondDash+1);
		System.out.println("third dash: "+ thirdDash);
		
		
		// find the last dash.
		
		int lastDash = list.lastIndexOf("-");
		System.out.println("Last dash: " + lastDash);
		
		
		// lastIndexOf - can be used when we search for last position of the character/string
		
		
		
		
		
		
		
		
		
	}

}

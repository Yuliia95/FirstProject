package Day10;

public class IfStatementWithBooleanVariables {
	public static void main(String[] args) {
		boolean isBreakTime = false;
		if(isBreakTime == true) {
			System.out.println("BREAK TILL 8:35 PM");
		}else {
			System.out.println("No Break time yet");
			
			}
		
		//second version
		
		if(isBreakTime) {
			System.out.println("BREAK TILL 8:35 PM");
		}else {
			System.out.println("No Break time yet");
			
			}
		
		boolean classTime = true;
		
		if(classTime) {
			System.out.println("Come back on time");
			System.out.println("Stop talking");
			System.out.println("Pay Attention");
			System.out.println("Code and have fun!");
			
		}else {
			System.out.println("Take a walk and have some water");
		}
		
		boolean qualified = true;
		// send a notification message only if not qualified
		//we need to check if qualified variable contains FALSE
		
		if(qualified == false) {
		System.out.println("Your application was not approved. Thank you");
		
		
	}
	
	

}
}
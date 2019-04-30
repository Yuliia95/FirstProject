package Day11;

public class OrLogicWithSwitch {
public static void main(String[] args) {
	
	char grade = 'A';
			// A, B< C -> Pass D,E -> fail  invalid grade
		switch(grade)	{
		case 'A':
		case 'B':
		case 'C':
		System.out.println("Pass");
		break;
		
		case 'D':
		case'E':
		System.out.println("Fail");
		break;
		
		default:
			System.out.println("Invalid Grade")	;
			
		
		
		
		}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}

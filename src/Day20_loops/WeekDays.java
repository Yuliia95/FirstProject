package Day20_loops;

public class WeekDays {
	public static void main(String[] args) {
		//1-7
		//1-Monday
		//2 - Tuesday
		
		for(int day = 1; day <= 7; day++) {
		System.out.println(day);
		
		switch(day) {
		case 1:
		System.out.println(day+ " -Monday");
		break;
		
		case 2:
			System.out.println(day + " -Tuesday");
			break;
			
		case 3:
			System.out.println(day + " -Wednesday");
			break;
			
		case 4:
			System.out.println(day + " -Thursday");
			break;
			
		case 5:
			System.out.println(day + " -Friday");
			break;
			
		case 6:
			System.out.println(day + " -Saturday");
			break;
			
		case 7:
			System.out.println(day + " -Sunday");
			break;
			
			default:
				System.out.println("No more weekDays");
				return;
		
		
		}
		}
	}

}

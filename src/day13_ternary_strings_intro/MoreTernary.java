package day13_ternary_strings_intro;

public class MoreTernary {
	public static void main(String[] args) {
	String quality ="good";
	int rating =(quality.equals("good")) ? 100 : 0;
		// ? always afret condition, : - that's mean }else{
		System.out.println("Rating: " + rating);
		
		int PMhour = 6;
		//Rush hour during evening: 4 - 7;
		boolean rushHour = (PMhour >= 4 && PMhour <= 7)? true : false;
		//System.out.println(PMhour + " is rush hour? " + rushHour);
		
		 String result = rushHour == true ? "yes" : "no";
		
	  System.out.println(PMhour + " is rush hour? " + rushHour);
		
		
		int AMHour =10; // 6 -9 
		
		String amRushHour = (AMHour >= 6 && AMHour <= 9 ? "yes" : "no");
	    System.out.println(AMHour + " is rush hour? - " + amRushHour);
		
		
	}

}

package Day24;

public class Cities {
	public static void main(String[] args) {
	String[]cities = {"Washington D.C.", "Kiev", "Annandale", "Moscow", "Istanbul", "Baku", "Miami", "Silver Spring","McLean"};
	System.out.println(cities.length);
	//TASK print all cities that start with M
		
	for(int i = 0; i<cities.length; i++) {
		if(cities[i].startsWith("M")) {
			System.out.println(cities[i]);
		}
	}
		
		
		
		
		
		
		
	}
}

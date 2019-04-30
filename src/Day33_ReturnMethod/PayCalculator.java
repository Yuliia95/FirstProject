package Day33_ReturnMethod;

public class PayCalculator {
	public static void main(String[] args) {
		
		
	int pay = getHourlyPay(40, 50);
	System.out.println("Total pay for 40 hours: "+ pay);
	System.out.println(getHourlyPay(0, 10));
	}

	public static int getHourlyPay(int hours, int rate) {
		if(hours <= 0) {
			System.out.println("invalid hours!");
		return 0;
		}
		if(rate <= 0) {
			System.out.println("invalid rate!");
			return 0;
		}
			
		int total = hours * rate;
		return total;
	//System.out.println("END OF METHOD");
	 
	
			
			
		
}
}

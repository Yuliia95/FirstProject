package Day31_METHODS03;

public class Counter {
	public static void main(String[] args) {
		
		countUp(5);	//num = 5;
		countUp(10);//num = 10;
		countUp(-5);
		countDown(3);
	int n = 5;
	countDown(5);
	countDown(0);
	drive("Audi",60);
	
	}
	

	public static void countUp (int num) {
	if(num<1) {
		System.out.println("Invalid input");
	}else {
	for(int i = 1; i <= num; i++) {
	System.out.print(i+" ");
	
		}
	System.out.println();
	
	}
}
public static void countDown(int num) {
	for(int n = num; n >= 1; n--) {
		System.out.print(n+" ");
	}
System.out.println();
}

public static void drive(String car, int speed) {
	System.out.println(car+" is driving "+speed+" mph");
	
}





}
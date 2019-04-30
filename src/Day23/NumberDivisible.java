package Day23;

public class NumberDivisible {
	public static void main(String[] args) {
		
		for (int i = 0; i <= 50; i++) {
			if (i % 5 == 0) {
				continue;
			}
			if (i % 20 == 0) {
				break;
			}
			System.out.println(i);
		}

	}


		
	}



package day4_primitives_operators;

public class UsingVariables {
	public static void main(String[] args) {
		//declare num1, num2, num3
		
		int num1, num2, num3;
		num1 = 100;
		num2 = num1;
		
		System.out.println(num1);
		System.out.println(num2);
		
		num2 = 200;
		num1 = num2;
		num3 = num1;
		
		System.out.println(num1);
		System.out.println(num2);
		System.out.println(num3);
		// what we did we assigned the new value to num1 and num3
		
		//declare apples and assign 25
		//declare kiwis and assign value of apples
		//declare mangoes and assign 55
		//assign mangoes to kiwis
		
		int apples;
		apples = 25;
		int kiwis;
		kiwis = apples;
		int mangoes = 55;
		kiwis = mangoes;
		
		System.out.println(apples); //25
		System.out.println(kiwis); //55
		System.out.println(mangoes); //55
		
	
}
	
		

}

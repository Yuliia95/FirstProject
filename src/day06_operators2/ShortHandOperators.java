package day06_operators2;

public class ShortHandOperators {
	public static void main(String[] args) {
		 int students = 45;
	     students = students + 5;
	     
	     System.out.println("Students: " + students);
	     
	     students = students - 2;
	     
	     System.out.println("Students: " + students);
	     
	     int teachers = 2; // increase teachers by 2.
	     System.out.println("Teachers: " + teachers);
	     
	     //teachers = teachers - 5;
	    // decrease teachers by 5 
	     
	     int cars = 12;
	     System.out.println("Cars: " + cars);

	     cars *= 2; // another way is cars = cars * 2;
	     
	     System.out.println(cars);
	     
	     cars += cars;
	     System.out.println("Cars: " + cars);
	     
	     int shoes = 20;
	     shoes /= 4;
	     System.out.println("Shoes :" + shoes);
	     
	     double price = 45.50;
	     int amount = 5;
	     
	     price += amount; 
	     
	     System.out.println(price);
		
		int minutes = 66;
		minutes %= 60;
		System.out.println("Ramaining: " + minutes);
		
		int pennies = 550;
		pennies %= 100; // pennies = pennies % 100;
		System.out.println("Pennies left: " + pennies);
		
		
		
		
		
		
		
		
		
		
		
		
	}
     
     
		
		
		
		
		

}

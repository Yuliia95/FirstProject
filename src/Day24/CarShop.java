package Day24;

import java.util.Arrays;

public class CarShop {
	public static void main(String[] args) {
	//  BMW, Audi, Ford, Honda, Mercedes, Mercury, Rolls-Royce, Tesla
	//  1. Step: Create an array of strings, and store these cars inside that array.	

	String[]cars = {"BMW", "Audi", "Ford", "Honda", "Mercedes", "Mercury", "Rolls-Royce", "Tesla"};
    String[] cars2 = new String[8];
    //2.Step: Print car names that starts with M
    
   for(String c: cars) {
	   if(!c.startsWith("M")) {
		   continue;
	   }
  
   System.out.println(c);
   }
	//3.Step: Print all cars that have letter "r" somewhere in the name
   //make your search case insensitive
   for (String car:cars) {
		if(car.toLowerCase().contains("r")) {
			System.out.print(car+",");

	}
}
	
	//4.step:Print car names that ends with a
   System.out.println("############");
   for(String car: cars) {
	   if(car.endsWith("a")) {
		   System.out.println(cars+ ",");
	   }
   }
	
   //5.Step: Print all cars that have at least 6 letters in the name.
   System.out.println("############");
   for (String string : cars) {
       if (string.length()>=6) {
           System.out.println(string);
       }
   }
   System.out.println("############");
   for(int i = 0; i<cars.length; i++) {
	   if(cars[i].length() >=6) {
		   System.out.println(cars[i]);
	   }
   }
	//6.Step: swap first and last value in the array
   System.out.println("############");
   //create a temp variable, that will get a values
   String temp = cars[0];
   //we swap values of first and last element
   cars[0] = cars[cars.length-1];
   //since temp variable has value of first element 
   cars[cars.length-1] = temp;
   System.out.println(Arrays.toString(cars));

	}
}

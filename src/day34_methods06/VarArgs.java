package day34_methods06;

import java.util.Arrays;

public class VarArgs {
	public static void main(String[] args) {
		
	printWords("red", "blue", "yellow");//3 values
	printWords("grey");//one value
	printWords();//empty.so array will be empty array.
	
	System.out.println(sum(3,5,10));
	System.out.println(sum(24634,345,32346));
	int budget = 200;
	if(sum(10, 45, 110, 30)<= budget) {
		System.out.println("Within budget");	
	}else {
		System.out.println("Broke");
	}
	cook("Burrito Bowl", "Rice", "Beans", "Meat", "Sour Cream", "Chesse", "Salsa", "Hot Sause");
	cook("Avocado Toast", "Avocado", "Sunny Side eggs", "Weat bread");
	
	shoppingList(100, "Avocado Toast", "Swatch watch watch", "Shoes", "Jacket");
	
	String[] myPets = {"cat", "horse", "dog", "sheep", "goat"};
	printWords(myPets);
	
	}
	
	
	
	public static void printWords(String ...words) {
	//handle it like an Array
		for(String w : words)	{
			System.out.println(w);
		}
}
//                    sum(10,30,40); ==> 80
	//                sum(30,40); ==> 70
public static int sum(int ...nums) {
	int sum = 0;
	for(int n : nums) {
		sum += n;// sum = sum +n ;
	}
	return sum;
}

public static void cook(String name, String...ings) {
	System.out.println("Food: "+ name);
	System.out.println(Arrays.toString(ings));
}
// shoppingList(100, "Avocado Toast", "Swatch watch watch", "Shoes", "Jacket;
public static void shoppingList (int totalPrice, String... items ) {
	System.out.print("Total cost: " + totalPrice);
	System.out.println(Arrays.toString(items));
}
































}


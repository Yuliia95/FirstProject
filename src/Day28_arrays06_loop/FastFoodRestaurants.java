package Day28_arrays06_loop;

import java.io.IOException;
import java.nio.*;
import java.nio.file.Files;
import java.nio.file.Paths;
public class FastFoodRestaurants {
	public static void main(String[] args) throws IOException {
	//read all data and assign to array 
	String[] data = Files.readAllLines(Paths.get("FastFoodRestaurants.csv")).toArray(new String[0]);
		
	System.out.println("Data size: "+ data.length);	
	//print first row
	System.out.println(data[0]);
	System.out.println(data[1]);
	
	//print last restaurant
	System.out.println(data[data.length -1]);
	
	//print each Restaurant information in separate line 	
	
	int counter = 0;
	for(String restaurant : data) {
		System.out.println("#"+counter+"=>"+restaurant);
	counter++;
	}
	//print all restaurant information in state of VA
	//and print the number
	System.out.println("##########################");
	int countVA = 0;
	for(String row : data) {
		if(row.contains(",VA,")) {
			System.out.println(row);
			countVA++;
		}
	}
	
	System.out.println("###Total restaurants in VA: "+ countVA);
	
	//print all restaurant information in state of VA
	//print the restaurant names along with cityname
	//example:Subway - Herndod
	//example: Taco Bell - Fairfax
	
	int cityname = 0;
	for(String res : data) {
		if(res.contains(",VA,")) {
		String[] resArr = res.split(",");		
			System.out.println(resArr[2]+ " - "+resArr[1]);
			
	
	
		}
	
		}	
	}

}

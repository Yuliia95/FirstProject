package Day27_arrays05;

import java.util.Arrays;

public class ArraysClass {
	public static void main(String[] args) {
		int[] nums = {43,12,4,1,3,5};
		//toString method
		Arrays.toString(nums);
	System.out.println(Arrays.toString(nums));
    String str = Arrays.toString(nums);
    System.out.println(str);
	
	//sort method.sort array in ascending order.
	Arrays.sort(nums);
	System.out.println(Arrays.toString(nums));
	
	System.out.println("#########");
String[] languages = {"Zulu", "Spanish", "Italian", "English", "Polish", "Arabic","Uzbek"};
	
	System.out.println(Arrays.toString(languages));
	Arrays.sort(languages);
	System.out.println(Arrays.toString(languages));
	System.out.println("#########");
	
	int[] nums2 = {345,665,3333,11,3,66};
	System.out.println(Arrays.toString(nums2));
	//find lowest and largest values from nums2 Array
	Arrays.sort(nums2);
	System.out.println(Arrays.toString(nums2));
	
	System.out.println("#########");
	int lowest = nums2[0];//find the lowest number
	int largest = nums2[nums2.length - 1];//find the largest number 
	System.out.println("Lowest num: "+lowest);
	System.out.println("Largest num: " + largest);
	
	
	}

}

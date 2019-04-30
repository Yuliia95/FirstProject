package day34_methods06;
import java.util.*;
import java.util.Arrays;

public class MainArray {
	public static void main(String[] args) {
		
	
	//int [] nums = CountArray.findOccurences();
	//System.out.println(Arrays.toString(nums));
	}

	public static int [] getRandomArray (int size) {
		Random rand = new Random();//create Random class object
		
		int [] nums= new int [size];//declare array with size number of elems
		for(int i = 0; i < size; i++) {
			nums[i] = rand.nextInt(101);// get random number and assign to array index
			
		}
		
		return nums;	

}
}
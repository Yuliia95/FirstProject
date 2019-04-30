package Day27_arrays05;

import java.util.*;

public class BinarySearch {
	public static void main(String[] args) {
		            //0,1,2,3, 4
		int[] nums = {4,6,7,10,55};
	Arrays.binarySearch(nums, 7);
	System.out.println(Arrays.binarySearch(nums, 7));//2
	System.out.println(Arrays.binarySearch(nums, 55));//4
	System.out.println(Arrays.binarySearch(nums, 5));//-2
	
	int i = Arrays.binarySearch(nums, 10);
	System.out.println(i);//3
	
	int[] nums2 = {7,6,4,10,55};
	System.out.println(Arrays.binarySearch(nums2, 40));
	
	}
}

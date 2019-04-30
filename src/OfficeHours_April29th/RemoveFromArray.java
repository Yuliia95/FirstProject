package OfficeHours_April29th;

import java.util.Arrays;

public class RemoveFromArray {
	public static void main(String[] args) {
		int[] nums = {1, 3, 1, 4, 1, 6};
		int target = 1;// need to remove all 1s from nums array
		
	//find out how many targets are in nums 
		int counter = 0;
	//loop and using if condition , increase counter for each match	
		for(int n : nums) {
		if(n == target) {	
		counter++;
		}
	}
	System.out.println(counter);
	//declare new empty array with size that does not include target count 
	int[] newArr = new int[nums.length - counter];
	 
	//loop nums one more time and add all values that are not target 
	int idx = 0;
	
	for(int n: nums) {
		if( n !=  target) {// (!(n == target)) - second option; 
			newArr[idx] = n;
		idx++;
		}
	}
	System.out.println(Arrays.toString(nums));
	System.out.println(Arrays.toString(newArr));
	
	
	}
}

package week1.day2;

import java.util.Arrays;

public class FindDuplicateWithArray {

	public static void main(String[] args) {
		
		int[] nums = {2, 5, 7, 6,8,7, 2, 5, 8,7};  //{2, 5, 7, 7, 5, 9, 2, 3};
		Arrays.sort(nums);
		for (int i = 0; i < nums.length; i++) {
			for (int j = i+1; j < nums.length; j++) {
				if(nums[i]==nums[j]) {
					System.out.println(nums[i]);
					break;
				}
			}
	}
	}
}

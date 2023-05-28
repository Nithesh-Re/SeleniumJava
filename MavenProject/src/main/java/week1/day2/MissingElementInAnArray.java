package week1.day2;

import java.util.Arrays;

public class MissingElementInAnArray {

	public static void main(String[] args) {
		int[] arr = { 4, 2, 1, 6, 8, 5, 3 };

		Arrays.sort(arr);
		System.out.println("Array values after sorting in ascending order");
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		System.out.println("\nMissing number in the Array");
		for (int i = 0; i < arr.length; i++) {
			if (i + 1 != arr[i]) {
				System.out.println(i + 1);
				break;
			}
		}
	}
}

package week1.day1;

import java.util.Scanner;

public class Fibbinocci {

	public static void main(String[] args) {
//		Write a logic to print fibbinocci from 0 to 56
		Scanner scannerObject = new Scanner(System.in);
		System.out.println("Get input from user for Fibbinocci series length");
		int fibbinocciLenth = scannerObject.nextInt();
		int firstNum = 0, secNum = 1, sum = 0;
		System.out.println("\nFibbinocci series\n");
		System.out.println(firstNum);
		System.out.println(secNum);
		for(int i=0;i<=fibbinocciLenth;i++) {
			sum =firstNum+secNum;
			System.out.println(sum);
			firstNum = secNum;
			secNum = sum;
		}
		scannerObject.close();
	}
}

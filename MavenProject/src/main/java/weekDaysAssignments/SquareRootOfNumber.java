package weekDaysAssignments;

import java.util.Scanner;

public class SquareRootOfNumber {

	public static void main(String[] args) {
		Scanner scannerObject = new Scanner(System.in);
		System.out.println("Get input from user");
		int inputNumber = scannerObject.nextInt();
		
		int midValue = inputNumber/2;
		System.out.println("\nMid Value of given input is "+midValue+"\n");
		for (int i = 2; i < midValue; i++) {
			if(i*i>inputNumber) {
				System.out.println(i-1+" is "+"The square root of "+inputNumber);
				break;
			}
		}
		
		scannerObject.close();
		
		/*
		 * divide the number by 2
		 * iterate i through for loop from 2 to less than inputNumber/2
		 * now check square of the i value and compare with inputNumber
		 * if square of i > inputNumber then print i-1 as square root of inputNumber
		 */
	}

}

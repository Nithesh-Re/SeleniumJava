package week1.day1;

import java.util.Scanner;

public class IsPrime {

	public static void main(String[] args) {
//		Write a logic to find if the given number is prime or not
		int c = 0;
		Scanner scannerObject = new Scanner(System.in);
		System.out.println("Get input from user for find given number is prime or not");
		int inputNumber = scannerObject.nextInt();
		for(int i=2;i<=inputNumber-1;i++) {
			if(inputNumber%i==0) {
				c++;
			}
		}
		if(c==0) {
			System.out.println("The given number is Prime");
		}
		else {
			System.out.println("The given number is not a Prime");
		}
		scannerObject.close();
	}

}

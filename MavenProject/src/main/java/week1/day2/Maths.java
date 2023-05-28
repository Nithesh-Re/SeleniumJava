package week1.day2;

public class Maths {

	public int add(int a, int b) {
		int c =a+b;
		System.out.println("sum of a & b is --> "+c);
		return c;
	}
	public int sub(int a, int b) {
		int c=a-b;
		System.out.println("subtraction of a & b is --> "+c);
		return c;
	}
	public int div(int a, int b) {
		int c=a/b;
		System.out.println("division of a & b is --> "+c);
		return c;
	}
	public int mul(int a, int b) {
		int c=a*b;
		System.out.println("product of a & b is --> "+c);
		return c;
	}
	public static void main(String[] args) {
		Maths maths =  new Maths();
		int sum = maths.add(10,5);
		int remaining = maths.sub(10,5);
		int quotient = maths.div(10,5);
		int product = maths.mul(10,5);
		System.out.println("\n\nsum --> "+sum+"\nremaining --> "+remaining+"\nquotient --> "+quotient+"\nproduct --> "+product);
	}
}

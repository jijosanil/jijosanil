package exceptionMngmntt;

import java.util.Scanner;

public class Example {
	public static void main(String args[]) {
		System.out.println("the result of Division "+divide());
		
	}
	private static int divide () {
		int x = getInt();
		int y = getInt();
		System.out.println("The value of X : "+x+"the value of Y "+y);
		return x/y;
	}
	private static int getInt() {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter an Integer Value");
		return s.nextInt();
	}
}

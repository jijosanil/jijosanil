package exceptionMngmntt;

import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Example {
	public static void main(String args[]) {
		System.out.println("the result of Division "+divide());
		
	}
	private static int divide () {
		int x = getInt();
		int y = getInt();
		System.out.println("The value of X : "+x+"the value of Y "+y);
		try {
		return x/y;
		}catch (ArithmeticException | NoSuchElementException e) {
			throw new ArithmeticException("Dividing By 0 attempted");
		}
	}
	private static int getInt() {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter an Integer Value");
		while(true) {
			try {
				return s.nextInt();	
			}catch (InputMismatchException e) {
				// 
				s.nextLine();// top flush the current line
				System.out.println("please enter a digit between 0 to 9");
			}
		}
	}
}

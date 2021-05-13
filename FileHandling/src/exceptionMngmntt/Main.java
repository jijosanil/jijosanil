package exceptionMngmntt;
import java.util.InputMismatchException;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
//		int x=33;
//		int y= 0;
//		System.out.println(divideLBYL(x, y));
//		System.out.println(divideBAPF(x, y));
//		System.out.println(divide(x, y));
		int x = getIntBAFP();
		System.out.println("the value of X is "+x);
		
		

	}

	private static int getIntLBYL() {
		Scanner s = new Scanner(System.in);
		System.out.println("Please enter the integer");
		String str = s.next();
		s.close();
		for (int i=0 ; i<str.length();i++) {
			if(!Character.isDigit(str.charAt(i)))
				return 0;
		}
		return Integer.parseInt(str);
		
	}
	
	private static int getIntBAFP() {
		Scanner s= new Scanner(System.in);
		System.out.println("please enter the integer");
		try {
			return s.nextInt();
			
		}catch (InputMismatchException e) {
			return 0;
		}
		
	}
	
	private static int getInt() {
		System.out.println("please enter the Integer");
		Scanner s = new Scanner(System.in);
		return s.nextInt();
	}
	private static int divideLBYL(int x, int y) {
		//look beore you leap approach
		if(y!=0) {
			return x/y;
			}
		else {
			return 0;
		}
	}
	private static int divideBAPF ( int x, int y) {
		//better to ask forgiveness than permission
		try {
			return x/y;
		}catch (ArithmeticException e) {
			//System.out.println(e.getMessage());
			return 0;
		}
	}
	
	private static int divide(int x, int y) {
		
		return x/y;
	}
	
}

package testPractice;
abstract class testAnonym implements Runnable{
	abstract void eat();
	public void run() {
		System.out.println("Printing from the Run Method: another way of Creating the anonymous class");
	}
}
interface testInterfaceAnonym{
	void eat();
}
public class TestAnonymousclass {
	public static void main(String[] args) {
		testAnonym t1 = new testAnonym() {
			
			@Override
			void eat() {
			System.out.println("the two steps taking place are "
					+ "\n1. The compiler creates an anonymous class which extends TestAnonym and implements the one method"
					+ "\n2. The object t1 can be used to call that implemented method");
				
			}
		};
		t1.eat();
		
		new Thread(new testAnonym() {
			
			@Override
			void eat() {}
		}).start();
		
		
				
		testInterfaceAnonym t2 = new testInterfaceAnonym() {
			
			@Override
			public void eat() {
				System.out.println("the two steps taking place are "
						+ "\n1. The compiler creates an anonymous class which implements testInterfaceAnonym "
						+ "\n2. The object t2 can be used to call that implemented method");
					
			}
		};
		t2.eat();
	}

}

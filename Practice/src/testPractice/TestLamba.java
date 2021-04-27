package testPractice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;



class Employee{
	private String emp_name;
	private int emp_no;
	
	public Employee(String emp_name, int emp_no) {
		super();
		this.emp_name = emp_name;
		this.emp_no = emp_no;
	}
	public int getEmp_no() {
		return emp_no;
	}
	public void setEmp_no(int emp_no) {
		this.emp_no = emp_no;
	}
	public String getEmp_name() {
		return emp_name;
	}
	public void setEmp_name(String emp_name) {
		this.emp_name = emp_name;
	}
	
}

interface UpperConcat{
	public String concatString (String s1 , String s2);
}

public class TestLamba {

	public TestLamba() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// comparison Between using the Anonymous class and Lambda expressions
		new Thread(new Runnable() {
			
			@Override
			public void run() {
					System.out.println("the Traditional Way using the anonymous class");
				
			}
		}).start();

		new Thread(()->{System.out.println("using the lambda expressions");
						System.out.println("Trying Multiple lines in the ");
						System.out.println("in the lambda expressions");
			}).start();
		
		Employee jijo = new Employee("Jijo", 31);
		Employee tim = new Employee("Tim", 30);
		Employee bob = new Employee("Bob", 25);
		Employee ryan = new Employee("Ryan",26);
		
		List<Employee> employees = new ArrayList<>();
		employees.add(jijo);
		employees.add(tim);
		employees.add(ryan);
		employees.add(bob);
		
		System.out.println("Before Sorting");
		for (Employee emp : employees) {
			System.out.println(emp.getEmp_name()+"  "+emp.getEmp_no());
			
		}
		
//		Collections.sort(employees, new Comparator<Employee>() {
//			@Override
//			public int compare(Employee e1,Employee e2) {
//				return e1.getEmp_name().compareToIgnoreCase(e2.getEmp_name());
//			}
//		});
		
		
		//Above Same but using Lambda
		Collections.sort(employees, (e1,e2)-> 
		e1.getEmp_name().compareToIgnoreCase(e2.getEmp_name()));
		
		System.out.println("After Sorting");
		for (Employee emp : employees) {
			System.out.println(emp.getEmp_name()+"  "+emp.getEmp_no());
			
		}
		
		UpperConcat uc1 = ( s1,  s2)-> s1.toUpperCase()+s2.toUpperCase();
		String silly = doStringStuff(uc1, employees.get(0).getEmp_name(), employees.get(1).getEmp_name());
		System.out.println(silly);
	}
	
	public static String doStringStuff(UpperConcat uc , String s1 , String s2) {
		return uc.concatString(s1, s2);
	}
}

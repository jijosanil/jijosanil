package Lambda.streamFuncs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Collections;
import java.util.Comparator;
import java.util.stream.*;

public class Main {
	public static void main(String argsp[]) {
		List<String> someBingos = Arrays.asList("C22","C23",
				"B33","B87","D53","A23","A45","A77","A88","N11","I33");
		List<String> ABingos = new ArrayList<String>();
		// Sorting using the anonymous class
//		Collections.sort(someBingos, new Comparator<String>() {
//			@Override
//			public int compare(String o1, String o2) {
//				// TODO Auto-generated method stub
//				return o1.compareToIgnoreCase(o2);
//			};
//		});
		
//		someBingos.sort(new Comparator<String>() {
//
//			@Override
//			public int compare(String o1, String o2) {
//	
//				return o1.compareToIgnoreCase(o2);
//			}
//			
//		});
		
		//Filter
		someBingos.forEach(s1 -> {
			if (s1.startsWith("A")) {
				ABingos.add(s1);
			}
		});
//		//Sorting Using the lambda expressions
//		Collections.sort(someBingos, (s1, s2) -> s1.compareToIgnoreCase(s2));

//		ABingos.sort((s1,s2)-> s1.compareToIgnoreCase(s2));
//		ABingos.forEach(number -> {
//			System.out.println(number);
//			});
		
		//All the above steps can be done with single Stream statement
		someBingos
		.stream()
		.map(String::toUpperCase)
		.filter(s1 -> s1.startsWith("A"))
		.sorted()
		.forEach(System.out::println)
		;
		
		// Using the Stream directly
		
		Stream<String> ioNumbers = Stream.of("I45","I12","I76","O32","034");
		Stream<String> InNumbers = Stream.of("I76","I11","N65","N33");
		Stream<String> concatSteam = Stream.concat(ioNumbers, InNumbers);
		System.out.println("-------------------------------------------");
		System.out.println(concatSteam.distinct().peek(s->System.out.println(s)).count());
		
		System.out.println("-------------------------------------------");
		
		Employee jijo = new Employee("Jijo Sanil", 31);
		Employee jack = new Employee("Jack Hill", 36);
		Employee john = new Employee("John Doe", 28);
		Employee Snow = new Employee("Snow White",35 );
		List<Employee> employees = new ArrayList<Employee>();
		Collections.sort(employees , new Comparator<Employee>() {
			@Override
			public int compare(Employee e1,Employee e2) {
			return e1.getEmployeeName().compareToIgnoreCase(e2.getEmployeeName());
			}
		});
		
		Department dev = new Department("Developers");
		dev.addEmployee(jijo);
		dev.addEmployee(john);
		
		Department hr = new Department("HR");
		hr.addEmployee(Snow);
		hr.addEmployee(jack);
		
		List<Department> depts = new ArrayList<Department>();
		depts.add(dev);
		depts.add(hr);
		
		
		List<Employee> devEmp = new ArrayList<Employee>();
		
		devEmp = depts.stream()
		.filter(Department -> Department.getName().equalsIgnoreCase("developers"))
		.flatMap(Department -> Department.getEmployees().stream())
		.filter(Employee -> Employee.getEmployeeName().startsWith("J"))
		.sorted()
		.collect(Collectors.toList());
		
		devEmp.forEach(e1 -> System.out.println(e1.toString()));
		System.out.println("-------------------------------------------");
		//print the youngest employee
		depts.stream()
		.flatMap(dept -> dept.getEmployees().stream())
		.reduce((emp1,emp2) -> emp1.getAge()<emp2.getAge()?emp1:emp2)
		.ifPresent(System.out::println);
		System.out.println("-------------------------------------------");
		//print the youngest employee
		depts.stream()
		.flatMap(dept -> dept.getEmployees().stream())
		.reduce((emp1,emp2) -> emp1.getAge()>emp2.getAge()?emp1:emp2)
		.ifPresent(System.out::println);
	
		
		
		
		
		
		
		
	}

}

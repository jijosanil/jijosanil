package Lambda.lambdaFuncs;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.function.Function;
import java.util.function.IntPredicate;
import java.util.function.Predicate;

public class Main {

	public static void main(String[] args) {
		List<Employee> employees = new ArrayList<Employee>();
		employees.add(new Employee("Jijo Sanil",31));
		employees.add(new Employee("Tom Boy",25));
		employees.add(new Employee("Michael Scott", 40));
		employees.add(new Employee("Harvey Specter",41));
		Function<Employee, String> getLastName = employee -> {
			return employee.getEmployeeName().substring(employee.getEmployeeName().indexOf(' '));
		};
		Function<Employee , String> getFirstname = employee -> {
			return employee.getEmployeeName().substring(0,employee.getEmployeeName().indexOf(' '));
		};
		Random randBool = new Random();
		for (Employee employee : employees) {
			if (randBool.nextBoolean())
			{
				printAname(getLastName, employee);
			}
			else{
				printAname(getFirstname, employee);
			}
		}
		
		//For Each using the lambda
		 employees.forEach((Employee employee) -> {
		    System.out.println("Employee Name : "+ employee.getEmployeeName());
		    System.out.println("Employee Age : "+ employee.getAge());
		 });
		
		//Passing the Predicate as parameter 
        printEmpOnCondition12(employees,
                "age above 30",
                employee -> employee.getAge()>30);
        printEmpOnCondition12(employees,"Employees with age below 30",employee -> employee.getAge()<=30);

        
        //Examples of the Type Predicates
        IntPredicate greaterthan15 = i -> i > 15 ;
        IntPredicate lessthan100 = i -> i < 100;
        System.out.println(greaterthan15.test(25));
        System.out.println(lessthan100.test(120));
        //Chaining of the predicates
        System.out.println(greaterthan15.and(lessthan100).test(50));
        System.out.println(greaterthan15.or(lessthan100).test(10));

		 
	}
	private static void printAname(Function<Employee,String> getname, Employee employee){
		System.out.println(getname.apply(employee));
	}
	private static void printEmpOnCondition12(List<Employee> employees , String cond , Predicate<Employee>
	ageCondition){
		System.out.println(cond);
		System.out.println("==================");
		for (Employee employee : employees){
			if(ageCondition.test(employee)){
				System.out.println(employee.getEmployeeName());
			}
		}
	}
}


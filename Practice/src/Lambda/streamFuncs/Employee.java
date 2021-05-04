package Lambda.streamFuncs;

import java.util.Comparator;

public class Employee implements Comparable<Employee>{
    public String employeeName;
    public int age;
    public Comparator<Employee> cmp;
    public Employee(String ename, int age) {
        this.employeeName = ename;
        this.age = age;
        cmp = new Comparator<Employee>() {
			
			@Override
			public int compare(Employee o1, Employee o2) {
				// TODO Auto-generated method stub
				return 0;
			}
		};
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

	@Override
	public String toString() {
		return getEmployeeName()+" "+getAge();
	}

	public int compareTo(Employee o1) {
		// TODO Auto-generated method stub
		return this.getEmployeeName().compareTo(o1.getEmployeeName());
	}
    
	
}


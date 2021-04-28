package lambdaFuncs;

public class Employee {
    public String employeeName;
    public int age;

    public Employee(String ename, int age) {
        this.employeeName = ename;
        this.age = age;
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
}


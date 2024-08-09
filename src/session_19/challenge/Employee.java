package session_19.challenge;

public class Employee {
    String name;
    String department;
    double salary;

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", department='" + department + '\'' +
                ", salary=" + salary +
                '}';
    }

    Employee(String name, String department, double salary) {
        this.name = name;
        this.department = department;
        this.salary = salary;


    }
    public String getDepartment(){
        return department;

    }
    public double getSalary(){
        return salary;
    }
}

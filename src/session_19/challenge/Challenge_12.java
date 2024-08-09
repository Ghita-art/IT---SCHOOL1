package session_19.challenge;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class Challenge_12 {
    public static void main(String[] args) {

        List<Employee> employees = Arrays.asList(
                new Employee("Alice", "HR", 60000),
                new Employee("Bob", "IT", 80000),
                new Employee("Charlie", "HR", 70000),
                new Employee("David", "Finance", 90000),
                new Employee("Eva", "IT", 95000),
                new Employee("Frank", "Finance", 80000)
        );

        Map<String,Double> departmentTotalSalary = employees.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment, Collectors.summingDouble(Employee::getSalary)));

        Optional<Map.Entry<String, Double>> highestSalaryDepartment = departmentTotalSalary.entrySet().stream()
                .max(Map.Entry.comparingByValue());

        highestSalaryDepartment.ifPresent(department ->
                System.out.println("Department with the highest total salary: " + department.getKey() +
                        " with total salary: " + department.getValue()));

    }
}



package practice.nov.java8;

import java.util.List;

public class EmployeeUtility {

    public static List<Employee> getAllEmployeeList(){
        List<Employee> employees = List.of(
                new Employee("Sudip", "Kumar", new Address("Kolkata", "WB"), "IT", 50000),
                new Employee("Amit", "Sharma", new Address("Delhi", "DL"), "HR", 45000),
                new Employee("Priya", "Singh", new Address("Mumbai", "MH"), "IT", 55000),
                new Employee("Ravi", "Verma", new Address("Chennai", "TN"), "IT", 47000),
                new Employee("Neha", "Patel", new Address("Bangalore", "KA"), "Sales", 52000),
                new Employee("Rohit", "Saxena", new Address("Bangalore", "KA"), "Sales", 92000)
        );
        return employees;
    }

}

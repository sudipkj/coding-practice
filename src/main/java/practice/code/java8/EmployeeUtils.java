package practice.code.java8;

import java.util.Arrays;
import java.util.List;

public class EmployeeUtils {

    protected static List<Employee> getEmployees() {
        List<Employee> empList = Arrays.asList(new Employee(4, 13000l, "Hero", "dev"),
                new Employee(1, 12000l, "Sudip", "QA"),
                new Employee(2, 15000l, "Rakesh", "QA"),
                new Employee(3, 11500l, "Rohit", "dev"));
        return empList;
    }
}

package practice.code.java8;

import java.util.List;
import java.util.Optional;

public class GetSumOfAllEmployeeSalary {
    public static void main(String[] args) {

        List<Employee> allEmployees = EmployeeUtils.getEmployees();

        // Get total salary of employees
        Optional<Long> totalSalary = allEmployees.stream().map(e -> e.getSalary()).reduce(Long :: sum);
        totalSalary.ifPresent(System.out::println);

    }
}

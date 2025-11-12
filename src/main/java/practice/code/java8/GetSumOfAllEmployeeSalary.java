package practice.code.java8;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class GetSumOfAllEmployeeSalary {
    public static void main(String[] args) {

        List<Employee> allEmployees = EmployeeUtils.getEmployees();

        // Get total salary of employees
        Optional<Long> totalSalary = allEmployees.stream().map(e -> e.getSalary()).reduce(Long :: sum);
        totalSalary.ifPresent(System.out::println);

        Optional<Long> max = allEmployees.stream().map(e->e.getSalary()).max(Long::compareTo);
        System.out.println(max);

        // Convert list of employees to map of empid and object
        Map<Integer, Employee> empMap = allEmployees.stream().collect(Collectors.toMap((Employee:: getEmpId), emp-> emp));
        empMap.entrySet().stream().forEach(System.out::println);

        //

    }
}

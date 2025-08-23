package practice.code.java8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static practice.code.java8.EmployeeUtils.getEmployees;

public class EmployeeTest {
    public static void main(String[] args) {
        // Find employee with second-highest salary

        List<Employee> empList = getEmployees();

        Comparator<Employee> ct = Comparator.comparingLong(Employee::getSalary);

        Comparator<Employee> ct1 = (o1, o2) -> o1.getSalary()> o2.getSalary()? -1 : 1;

        empList.stream().sorted(ct1).map(e-> e.getEmpId()).skip(1).findFirst().ifPresent(System.out::println);

        // Group Employees by their dept

        Map<String, List<Employee>> empmap = empList.stream().collect(Collectors.groupingBy(Employee::getDept, Collectors.toList()));

        System.out.println("Output :: "+empmap);



    }

}

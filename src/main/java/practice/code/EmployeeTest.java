package practice.code;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class EmployeeTest {
    public static void main(String[] args) {
        // Find employee with second-highest salary

        List<Employee> empList = Arrays.asList(new Employee(4, 13000l, "Hero", "dev"),
                new Employee(1, 12000l, "Sudip", "QA"),
                new Employee(2, 15000l, "Rakesh", "QA"),
                new Employee(3, 11500l, "Rohit", "dev"));

        Comparator<Employee> ct = Comparator.comparingLong(Employee::getSalary);

        Comparator<Employee> ct1 = (o1, o2) -> o1.getSalary()> o2.getSalary()? -1 : 1;

        empList.stream().sorted(ct1).map(e-> e.getEmpId()).skip(1).findFirst().ifPresent(System.out::println);

        // Group Employees by their dept

        Map<String, List<Employee>> empmap = empList.stream().collect(Collectors.groupingBy(Employee::getDept, Collectors.toList()));

        System.out.println("Output :: "+empmap);



    }
}

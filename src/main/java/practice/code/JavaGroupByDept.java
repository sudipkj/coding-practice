package practice.code;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class JavaGroupByDept {

    public static void main(String[] args) {


        List<Employee> empList = Arrays.asList(new Employee(4, 13000l, "Hero", "dev"),
                new Employee(1, 12000l, "Sudip", "QA"),
                new Employee(2, 15000l, "Rakesh", "QA"),
                new Employee(3, 11500l, "Rohit", "dev"));

        // Group Employees by their dept

        Map<String, List<Employee>> empGroup = empList.stream().collect(Collectors.groupingBy(Employee:: getDept, Collectors.toList()));
        System.out.println(empGroup);
    }
}

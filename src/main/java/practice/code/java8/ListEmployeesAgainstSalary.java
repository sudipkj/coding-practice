package practice.code.java8;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static com.fasterxml.jackson.databind.type.LogicalType.Map;

public class ListEmployeesAgainstSalary {
    public static void main(String[] args) {
        List<Employee> empList = EmployeeUtils.getEmployees();

        Map<String, Long> mapOfEmpNameAndSalary = empList.stream()
                .collect(Collectors.groupingBy(Employee::getName, Collectors.summingLong(Employee::getSalary)));

        System.out.println(mapOfEmpNameAndSalary);
    }
}

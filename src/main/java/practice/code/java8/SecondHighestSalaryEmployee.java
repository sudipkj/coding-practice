package practice.code.java8;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class SecondHighestSalaryEmployee {

    public static void main(String[] args) {
        List<Employee> empList = EmployeeUtils.getEmployees();

        //Sort
        Comparator<Employee> ct = (a, b) -> a.getSalary() > b.getSalary() ? -1 : a.getSalary() < b.getSalary() ? 1 : 0;
        List<Employee> sortedList = empList.stream().sorted(ct).collect(Collectors.toList());


        //get second by skipping 1
        Map<String, Long> mapOfNameSalary = sortedList.stream().skip(1).findFirst().stream().collect(Collectors.toMap(Employee::getName, Employee::getSalary));
        System.out.print(mapOfNameSalary);
    }
}

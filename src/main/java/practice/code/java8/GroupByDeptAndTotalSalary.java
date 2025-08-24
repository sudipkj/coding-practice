package practice.code.java8;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupByDeptAndTotalSalary {

    public static void main(String[] args) {
        List<Employee> empList = EmployeeUtils.getEmployees();

        Map<String, Long> deptSalaryGroup = empList.stream().collect(Collectors.groupingBy(Employee::getDept, Collectors.summingLong(Employee::getSalary)));
        System.out.println(deptSalaryGroup);
    }
}

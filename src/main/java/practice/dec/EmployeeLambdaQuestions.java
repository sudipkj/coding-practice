package practice.dec;

import lombok.NonNull;
import practice.nov.java8.Employee;
import practice.nov.java8.EmployeeUtility;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.stream.Collectors;

import static practice.nov.java8.EmployeeUtility.getAllEmployeeList;

public class EmployeeLambdaQuestions {

    public static void main(String[] args) {
        // List total salary spent by company
        //getSalarySpentByOrg();

        //List total salary spent by company per department
        // getTotalSalarySpentPerDept();

        // Show average salary per dept
//        getAverageSalaryPerDept();

        //Show number of employees in Sales
        //totalEmployeesInSales();
        //Show department wise employees
        //departmentWiseEmployees();

        //Show highest salary and lowest salary
        //getHighestSalary();
//        getHighestSalaryAndName();
    }


    private static void getHighestSalary() {
        OptionalInt highestSalary = getAllEmployeeList().stream().mapToInt(Employee::getSalary).max();
        System.out.println(highestSalary);
    }

    private static void departmentWiseEmployees() {
        Map<String, List<String>> departmentWiseEmployees = getAllEmployeeList().stream()
                .collect(Collectors.groupingBy((Employee::getDeptName), Collectors.mapping(Employee::getFName, Collectors.toList())));
        System.out.println(departmentWiseEmployees);
    }

    private static void totalEmployeesInSales() {
        long total = getAllEmployeeList().stream().filter(e -> e.getDeptName().equalsIgnoreCase("Sales")).count();
        System.out.println(total);
    }

    private static void getAverageSalaryPerDept() {
        Map<String, Double> averageSalaryPerDept = getAllEmployeeList().stream()
                .collect(Collectors.groupingBy((Employee::getDeptName), Collectors.averagingInt(Employee::getSalary)));
        System.out.println(averageSalaryPerDept);
    }

    public static void getSalarySpentByOrg() {
        Optional<Integer> sum = getAllEmployeeList().stream().map(Employee::getSalary).reduce(Integer::sum);
        System.out.println(sum);
    }

    private static void getTotalSalarySpentPerDept() {
        Map<String, Long> totalSalarySpentPerDept = getAllEmployeeList().stream()
                .collect(Collectors.groupingBy((Employee::getDeptName), Collectors.summingLong(Employee::getSalary)));
        System.out.println(totalSalarySpentPerDept);
    }
}



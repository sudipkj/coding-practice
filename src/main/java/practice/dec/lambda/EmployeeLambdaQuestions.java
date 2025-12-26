package practice.dec.lambda;

import practice.nov.java8.Employee;

import java.util.*;
import java.util.stream.Collectors;

import static practice.nov.java8.EmployeeUtility.getAllEmployeeList;

public class EmployeeLambdaQuestions {

    public static void main(String[] args) {
        // List total salary spent by company
        // getSalarySpentByOrg();

        //List total salary spent by company per department
//        getTotalSalarySpentPerDept();

        // Show average salary per dept
//        getAverageSalaryPerDept();

        //Show number of employees in Sales
        //totalEmployeesInSales();
        //Show department wise employees
//        departmentWiseEmployees();

        //Show highest salary and lowest salary
        getHighestSalary();
//        getHighestSalaryAndName();
    }

    private static void getHighestSalary() {
        OptionalLong highestSalary = getAllEmployeeList().stream().mapToLong(Employee::getSalary).max();
        System.out.println(highestSalary);

//        getHighestSalaryAndName
        Comparator<Employee> ct = (a,b) -> a.getSalary()<b.getSalary()?1:a.getSalary()> b.getSalary()? -1 : 0;
        Employee nameAndHighestSal = getAllEmployeeList().stream().sorted(ct).findFirst().get();
        System.out.println(nameAndHighestSal.getFName() + " " + nameAndHighestSal.getSalary());
    }

    private static void departmentWiseEmployees() {
        Map<String, List<Employee>> deptByEmp = getAllEmployeeList().stream()
                .collect(Collectors.groupingBy((Employee::getDeptName), Collectors.toList()));

        System.out.println(deptByEmp);

        Map<String, List<String>> deptByEmpName = getAllEmployeeList().stream().collect(Collectors.groupingBy(Employee::getDeptName,
                Collectors.mapping(Employee::getFName, Collectors.toList())));
        System.out.println("final result :" + deptByEmpName);

    }

    private static void totalEmployeesInSales() {
        Long count = getAllEmployeeList().stream()
                .filter(e -> e.getDeptName().equalsIgnoreCase("Sales"))
                .count();
        System.out.println(count);

    }

    private static void getAverageSalaryPerDept() {
        Map<String, Double> result = getAllEmployeeList().stream().collect(Collectors.groupingBy((Employee::getDeptName),
                Collectors.averagingDouble(Employee::getSalary)));
        result.entrySet().stream().forEach(System.out::println);
    }

    private static void getTotalSalarySpentPerDept() {
        Map<String, Integer> totalSalarySpentPerDept = getAllEmployeeList().stream()
                .collect(Collectors.groupingBy((Employee::getDeptName), Collectors.summingInt(Employee::getSalary)));
        totalSalarySpentPerDept.entrySet().stream().forEach(System.out::println);
    }

    private static void getSalarySpentByOrg() {
        int totalSalary = getAllEmployeeList().stream().mapToInt(Employee::getSalary).sum();
        System.out.println("Salary spent by org : " + totalSalary);
    }


    /*private static void getHighestSalary() {
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
    }*/
}



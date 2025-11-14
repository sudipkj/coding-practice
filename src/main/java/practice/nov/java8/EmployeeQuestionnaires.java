package practice.nov.java8;

import java.util.List;
import java.util.Map;
import java.util.OptionalInt;
import java.util.stream.Collectors;

import static practice.nov.java8.EmployeeUtility.getAllEmployeeList;

public class EmployeeQuestionnaires {

    public static void main(String[] args) {

        // List total salary spent by company
        int totalExpense = getAllEmployeeList().stream().mapToInt(Employee::getSalary).sum();
        System.out.println("List total salary spent by company : " + totalExpense);


        // List total salary spent by company per department
        Map<String, Integer> totalExpensePerDept = getAllEmployeeList().stream().collect(Collectors.groupingBy((Employee::getDeptName), Collectors.summingInt(Employee::getSalary)));
        System.out.println("List total salary spent by company per department : " + totalExpensePerDept);


        // Show number of employees in Sales
        long numberOfEmpInSales = getAllEmployeeList().stream().filter(e-> e.getDeptName().equalsIgnoreCase("Sales")).count();
        System.out.println("Show number of employees in Sales :: "+numberOfEmpInSales);

        // Show department wise employees
        Map<String, List<Employee>> deptWiseEmployee = getAllEmployeeList().stream().collect(Collectors.groupingBy((Employee::getDeptName),
                Collectors.toList()));
        System.out.println("Show department wise employees :: "+deptWiseEmployee);

        // Show highest salary and lowest salary
        OptionalInt maxSalary = getAllEmployeeList().stream().mapToInt(Employee::getSalary).max();
        OptionalInt minSalary = getAllEmployeeList().stream().mapToInt(Employee::getSalary).min();
        System.out.println("Highest salary is "+ maxSalary + " and lowest salary is " + minSalary);

    }
}

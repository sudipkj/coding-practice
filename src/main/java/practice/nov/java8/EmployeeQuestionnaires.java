package practice.nov.java8;

import java.util.*;
import java.util.stream.Collectors;

import static practice.nov.java8.EmployeeUtility.getAllEmployeeList;

public class EmployeeQuestionnaires {

    public static void main(String[] args) {

        // List total salary spent by company
        int totalSalry = getAllEmployeeList().stream().mapToInt(Employee::getSalary).sum();
        System.out.println(totalSalry);
        // List total salary spent by company per department
        Map<String, Integer> expPerDept = getAllEmployeeList().stream().collect(
                Collectors.groupingBy((Employee::getDeptName), Collectors.summingInt(Employee::getSalary)));
        expPerDept.entrySet().forEach(System.out::println);

        //Show average salary per dept
        Map<String, Double> avSalPerDept = getAllEmployeeList().stream().collect(
                Collectors.groupingBy((Employee::getDeptName),Collectors.averagingInt(Employee:: getSalary)));
        System.out.println(avSalPerDept);



        // Show number of employees in Sales
        long count = getAllEmployeeList().stream().
                filter(e->e.getDeptName().equalsIgnoreCase("Sales")).count();
        System.out.println("Number of  employees in Sales is " + count);


        // Show department wise employees
        Map<String, List<Employee>> deptWiseEmp = getAllEmployeeList().stream().collect(
                Collectors.groupingBy((Employee::getDeptName), Collectors.toList()));

        // Show highest salary and lowest salary

        OptionalInt highestSal = getAllEmployeeList().stream().mapToInt(Employee::getSalary).max();
        System.out.println(highestSal.getAsInt());



    }
}

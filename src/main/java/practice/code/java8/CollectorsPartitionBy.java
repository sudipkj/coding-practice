package practice.code.java8;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CollectorsPartitionBy {

    // write a program to find male/ female

    public static void main(String[] args) {
        List<Employee> empList = EmployeeUtils.getEmployeesList2();
        Map<Boolean, List<Employee>> empPartition =
                empList.stream().collect(Collectors.partitioningBy(emp -> emp.getGender().equalsIgnoreCase("Male")));
        System.out.println(empPartition);



        int [] array = {2,4,2,5,8,0,8,0};
        List<Integer> listofInt= Arrays.stream(array).distinct().boxed().collect(Collectors.toList());

        int[][] multiDimArray = {
                {1, 4, 1},
                {2, 6, 3, 9, 5}
        };

        List<Integer> listOfMulti = Arrays.stream(multiDimArray).flatMap(ints -> Arrays.stream(ints).boxed()).collect(Collectors.toList());
        System.out.println(listOfMulti);
    }



}

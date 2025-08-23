package practice.code.problems;

import java.util.*;
import java.util.stream.Collectors;

public class CompareHashMaps {

    public static void main(String[] args) {
        Map<Integer, String> map1 = new HashMap<>();
        map1.put(1, "Sudip");
        map1.put(2, "Rakesh");
        map1.put(3, "Sandip");
        map1.put(4, "Sandeep");
        map1.put(5, "Heo");

        Map<Integer, String> map2 = new HashMap<>();
        map2.put(1, "Sudipq");
        map2.put(2, "Rakesh");
        map2.put(3, "Sandip");
        map2.put(4, "Sandeep");


        List<Boolean> bool = map1.entrySet().stream().map(
                entrySet -> map2.entrySet().stream().anyMatch(
                        map2entryset -> entrySet.getKey().equals(map2entryset.getKey())
                                && entrySet.getValue().equalsIgnoreCase(map2entryset.getValue()))).collect(Collectors.toList());

        System.out.println(bool);
        /*Employee e1 = new Employee(1, 13000l, "Hero", "dev");
        Employee e2 = new Employee(1, 12000l, "Sudip", "QA");
        Employee e3 = new Employee(2, 15000l, "Rakesh", "QA");
        Employee e5 = new Employee(3, 11500l, "Rohit", "dev");

        Set<Employee> empSet = new HashSet<>();
        empSet.add(e1);
        empSet.add(e2);
        empSet.add(e3);
        empSet.add(e5);

        System.out.println(empSet);*/
    }
}

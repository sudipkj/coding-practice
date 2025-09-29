package practice.code.problems;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CountStringDuplicates {

    public static void main(String[] args) {
        List<String> list = List.of("Sudip", "Rahul", "Sudip", "usipd");
        Map<String, Long> map = list.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        map.entrySet().forEach(e-> System.out.println(e.getKey()+ " " + e.getValue()));

    }
}

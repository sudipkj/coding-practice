package practice.code.problems;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindCharOccurance {

    public static void main(String[] args) {
        String myString = "He will make it through this time";

        //Find a map with chars and their count
        Map<Character, Integer> map = myString.chars().mapToObj(c-> (char) c).collect(Collectors.groupingBy(c->c, Collectors.
                collectingAndThen(Collectors.counting(),Long :: intValue)));

        Map<Character, Long>  myMap = myString.chars() // Get an IntStream of character codes
                .mapToObj(c -> (char) c) // Convert IntStream to Stream<Character>
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting())); // Group by character and count occurrences

        System.out.println(myMap);
}
}

package practice.code.problems;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class FindCharFrequency {

    public static void main(String[] args) {
        Map<Character, Integer> myMap = getCharCount("here I am ");
        System.out.println(myMap);
    }

    public static Map<Character, Integer> getCharCount(String s) {
        return s.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(
                        c -> c,
                        Collectors.collectingAndThen(
                                Collectors.counting(),
                                Long::intValue
                        )
                ));
    }
}

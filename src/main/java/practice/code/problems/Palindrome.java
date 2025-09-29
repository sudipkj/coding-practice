package practice.code.problems;

import java.util.Arrays;
import java.util.stream.Stream;

public class Palindrome {

    public static void main(String[] args) {
        String str = "level";
        Boolean bool = Arrays.asList(str).stream().anyMatch(s-> s.equalsIgnoreCase(new StringBuilder(str).reverse().toString()));
        System.out.println(bool);
        Stream<Integer> s1 = Arrays.asList(1,2,3,4,5).stream();
        Stream<Integer> s2 = Arrays.asList(11,22,33,44,55).stream();
        Stream<Integer> stream = Stream.concat(s1,s2);
        stream.forEach(System.out::println);
    }
}

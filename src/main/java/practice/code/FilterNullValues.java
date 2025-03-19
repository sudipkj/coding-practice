package practice.code;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class FilterNullValues {

    public static void main(String[] args) {
        //WAP filter null values from list of values

        List<String> list = Arrays.asList("Sudip", "Rakesh", null, "Rohit");

        list.stream().filter(Objects::nonNull).forEach(System.out::println);
    }
}

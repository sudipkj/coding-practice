package practice.nov.java8;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class FlextonInterview {

    public static void main(String[] args) {

        final Map<Integer, String> map = new HashMap<>();
        map.put(1, "Apple");
        map.put(2, "Banana");
        map.put(3, "Orange");


        List<String> list = map.values().stream().collect(Collectors.toList());



        List<String> traditionalList = new ArrayList<>();
        for(String value : map.values()){
            traditionalList.add(value);

        }

        ClassLoader loader = FlextonInterview.class.getClassLoader();


    }
}

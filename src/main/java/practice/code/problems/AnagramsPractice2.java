package practice.code.problems;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class AnagramsPractice2 {

    public static void main(String[] args) {

        List<String> list = List.of("ate", "eat", "fat", "tar", "atf", "rat");

        Map<String, Integer> map = new HashMap<>();
        Integer count;

        /*for(int i = 0 ; i<list.size(); i++){
            String s = list.get(i);
            char[] chars  = s.toCharArray();
            Arrays.sort(chars);
            String finalStr = new String(chars);
            if(map.keySet().contains(finalStr)){
                count = map.get(finalStr);
                count++;
                map.put(finalStr, count);
            }else {
                map.put(finalStr, 1);
            }
        }*/
        Map<String, Integer> anagramsMap = list.stream()
                .collect(Collectors.groupingBy(
                        s -> s.chars().sorted()
                                .mapToObj(c -> String.valueOf((char) c))
                                .collect(Collectors.joining()),
                        Collectors.summingInt(e -> 1)
                ));

        System.out.println(anagramsMap);
    }

}

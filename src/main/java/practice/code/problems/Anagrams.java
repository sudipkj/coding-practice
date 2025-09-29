package practice.code.problems;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Anagrams {
    // Count number of anagrams

    public static void main(String[] args) {
        Map<String, Integer> map = getAnagramCount(List.of("ate", "tan", "eat", "nat", "lot"));
        System.out.println(map);
    }
    public static Map<String, Integer> getAnagramCount(List<String> list){
        Map<String, Integer> map = new HashMap<>();
        for(String s : list){
            char[] charArray = s.toLowerCase().toCharArray();
            Arrays.sort(charArray);
            String sortedString = new String(charArray);
            map.merge(sortedString, 1, Integer::sum);
        }
        return map;
    }
}

package practice.code;

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
        int count = 1;
        for(String s : list){
            char [] charArray = s.toCharArray();
            Arrays.sort(charArray);
            String sortedString = new String(charArray);
            if(map.keySet().contains(sortedString)){
                count = map.get(sortedString);
                count ++;
                map.put(sortedString, count);
            }else {
                map.put(sortedString, 1);
            }
        }

        return map;

    }
}

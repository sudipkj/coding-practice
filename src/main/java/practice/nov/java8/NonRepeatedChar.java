package practice.nov.java8;

import java.util.*;

public class NonRepeatedChar {

    //Find First Non-Repeated Character

    public static void main(String[] args) {

////        String str = "career";
//        String str = "Swiss";
//        Map<Character, Integer> map = new LinkedHashMap<>();
//        for(char ch : str.toLowerCase().toCharArray()){
//
//            map.put(ch,map.getOrDefault(ch,0) + 1);
//
//        }
//        for(Map.Entry<Character,Integer> entry : map.entrySet()){
//            if(entry.getValue() == 1){
//                System.out.println(entry.getKey());
//                break;
//            }
//
//        }

        List<Integer> list = Arrays.asList(5000,7000,3000,4000,9000);

        Integer secondHighest = list.stream().sorted(Comparator.reverseOrder()).skip(1).findFirst().orElse(0);

        System.out.println(secondHighest);
    }



}

package practice.code;

import java.util.HashMap;
import java.util.Map;

public class FindCharFrequency {

    public static void main(String[] args) {
        Map<Character, Integer> myMap = getCharCount("here I am ");
        System.out.println(myMap);
    }

    public static Map<Character, Integer>  getCharCount(String s){
        char [] charArray = s.toCharArray();
        Map<Character,Integer> charMap = new HashMap<>();
        int count = 0;
        for(int i =0; i < charArray.length; i++){
            if(charMap.keySet().contains(charArray[i])){
                count = charMap.get(charArray[i]);
                count++;
                charMap.put(charArray[i], count);
            }else {
                charMap.put(charArray[i], 1);
            }
        }

        return charMap;
    }
}

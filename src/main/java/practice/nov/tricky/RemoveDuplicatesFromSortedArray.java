package practice.nov.tricky;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RemoveDuplicatesFromSortedArray {

    public static void main(String[] args) {
        int[] array = {1, 2, 2, 2, 5, 5, 6, 7, 7, 7, 7, 9};
        List<Integer> list = new ArrayList<>();


        for (int i = 0; i < array.length; i++) {
            if (i>0 && array[i] != array[i - 1]) {
                list.add(array[i]);
            }else if(i == 0){
                list.add(array[0]);
            }
        }
        int [] newArray = list.stream().mapToInt(i->i).toArray();
        Arrays.stream(newArray).forEach(System.out:: println);
    }
}

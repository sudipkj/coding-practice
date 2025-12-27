package practice.dec.tricky;

import java.util.ArrayList;
import java.util.List;

public class RemoveDuplicatesFromSortedArray {

    public static void main(String[] args) {
        int[] array = {1, 2, 2, 2, 5, 5, 6, 7, 7, 7, 7, 9};
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < array.length; i++) {
            if (i+1 < array.length && array[i + 1] != array[i]) {
                result.add(array[i]);
            }
            if(i+1==  array.length){
                result.add(array[array.length-1]);
            }
        }
        System.out.println(result);
    }


}

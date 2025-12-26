package practice.dec.tricky;

import java.util.Arrays;

public class MaximumSubArray {
    public static void main(String[] args) {

        int[] array = {-2, 1, -3, 4, -1, 2, 1, -5, 4};

        //find max sum and sub array

        int maxSum = array[0];
        int startingIndex = 0;
        int endingIndex = 0;

        for(int i = 0; i < array.length; i++ ){
            int sum = 0;
            for(int j = i; j< array.length; j++){
                sum = sum + array[j];
                if(sum> maxSum){
                    maxSum = sum ;
                    startingIndex=i;
                    endingIndex=j;

                }
            }

        }
        System.out.println("max sum is "+ maxSum);
        int a [] = Arrays.copyOfRange(array, startingIndex,endingIndex+1);
        Arrays.stream(a).forEach(System.out::println);
        System.out.println(startingIndex+ "  :  "+ endingIndex);
    }


}

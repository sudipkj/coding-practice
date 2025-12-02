package practice.nov.tricky;

import java.util.Arrays;

public class MaximumSubarray {

    // Find maximum sum of subarray and return maximum sum and subarray

    public static void main(String[] args) {

        int[] array = {-2, 1, -3, 4, -1, 2, 1, -5, 4};

        int max = array[0];
        int[] subArray = new int[array.length];
        int start = 0, end = 0;

        for (int i = 0; i <= array.length; i++) {
            int sum = 0;
            for (int j = i; j < array.length; j++) {

                sum = sum + array[j];
//                max = Math.max(max, sum);
                if(sum>max){
                    max = sum;
                    start = i;
                    end = j;
                }


                System.out.println("i and j value is " + i + " " + j + " with sum " + sum + " max value "  + max);
            }


        }
        System.out.println(" start " + start + " end "+ end);
        Arrays.stream(Arrays.copyOfRange(array, start, end+1)).forEach(System.out::println);



    }
}

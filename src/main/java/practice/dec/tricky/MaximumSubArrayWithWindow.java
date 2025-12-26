package practice.dec.tricky;

import java.util.Arrays;

public class MaximumSubArrayWithWindow {

    public static void main(String[] args) {
        int[] arr = { 400, 544, 100, 200, 300,};

        int window = 2;
        int maxSum = arr[0];

        for (int i = 0; i < arr.length; i++) {

            int sum = 0;
            for (int j = i; j < arr.length && j-i < window;  j++) {
                sum = sum + arr[j];
                maxSum = Math.max(maxSum, sum);
            }
        }

        System.out.println("max sum is " + maxSum);
//        Arrays.stream(Arrays.copyOfRange(arr, start, end)).forEach(System.out::println);

    }
}

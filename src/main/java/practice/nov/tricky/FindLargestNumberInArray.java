package practice.nov.tricky;

import java.util.Arrays;

public class FindLargestNumberInArray {

    public static void main(String[] args) {
        int[] array = {10, 9, 14, 6, 6, 2, 7, 5, 14};

        //Find the largest element from int array. Result should be 14

        //First we would try brute force method
        // Sort the array and get the last element. O(n log n) for sorting + O(n)

        Arrays.sort(array);
        System.out.println("With Brute Force Solution  " + array[array.length - 1]);

        // Optimal solution for O(n)
        int largest = array[0];

        for (int i = 0; i < array.length; i++) {
            if (array[i] == largest) {
                continue;
            } else if (array[i] > largest) {
                largest = array[i];
            }
        }

        System.out.println("Largest Element using optimal solution is " + largest);

    }
}

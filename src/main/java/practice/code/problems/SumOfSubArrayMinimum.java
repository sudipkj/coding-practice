package practice.code.problems;

public class SumOfSubArrayMinimum {

    public static void main(String[] args) {
        int[] arr = {3, 1, 2};
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            int min = arr[i];
            for (int j = i; j < arr.length; j++) {
                min = Math.min(min, arr[j]);
                sum += min;

            }

        }

        System.out.println(sum);
    }
}

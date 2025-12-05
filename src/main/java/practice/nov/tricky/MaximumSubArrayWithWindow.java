package practice.nov.tricky;

public class MaximumSubArrayWithWindow {

    public static void main(String[] args) {
        int [] arr = {100, 200, 300, 400, 544};

        int k = 2;
        int max = 0;
        for(int i = 0; i <= arr.length && k<= arr.length; i++){
            int sum = arr[i];

            for(int j = i+1; j < k; j++){
                sum = sum + arr[j];
                max = Math.max(sum, max);

            }
            k++;
        }
        System.out.println(max);

    }
}

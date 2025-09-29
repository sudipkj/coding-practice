package practice.code.problems;

public class MinimumArray {
    public static int minSubArrayLen(int target, int[] nums) {
        int n = nums.length;
        int minimumWindow = Integer.MAX_VALUE;
        int left = 0;
        int sum = 0;
        for (int right = 0; right < n; right++) {
            sum += nums[right];
            while (sum >= target) {
                minimumWindow = Math.min(minimumWindow, right - left + 1);
                sum -= nums[left++];
            }
        }
        return minimumWindow == Integer.MAX_VALUE ? 0 : minimumWindow;
    }

    public static void main(String[] args) {
        int[] nums = {2, 3, 1, 2, 4, 3};
        int target = 7;
        System.out.println(minSubArrayLen(target, nums)); // Output: 2
    }
}

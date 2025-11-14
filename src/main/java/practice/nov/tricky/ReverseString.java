package practice.nov.tricky;

public class ReverseString {

    //Reverse string without using reverse funtion
    public static void main(String[] args) {

        String a = "aabbaa";

        System.out.println(testPalindrome(a));

    }

    public static boolean testPalindrome(String input) {
        int start = 0;
        int last = input.length() - 1;

        while (start < last) {
            if (input.charAt(start) != input.charAt(last)) {
                return false;
            } else {
                start++;
                last--;
            }
        }
        return true;
    }
}

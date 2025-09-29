package practice.code.problems;

public class AnagramsUsingLambda {
    public static void main(String[] args) {
        String[] anagram = {"listen", "silent"};
        // Convert both strings to lowercase and sort their characters
        int[] arr1 = anagram[0].toLowerCase().chars().sorted().toArray();
        int[] arr2 = anagram[1].toLowerCase().chars().sorted().toArray();
        boolean isAnagram = java.util.Arrays.equals(arr1, arr2);
        System.out.println("Are '" + anagram[0] + "' and '" + anagram[1] + "' anagrams? " + isAnagram);
    }
}

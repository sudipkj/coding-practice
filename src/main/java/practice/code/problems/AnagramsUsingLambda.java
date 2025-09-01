package practice.code.problems;

import org.springframework.util.Assert;

public class AnagramsUsingLambda {

    public static void main(String a[]) {
        String[] anagram = {"listen", "silent"};
        int v = anagram[0].toLowerCase().chars().reduce((i, j) -> i + j).getAsInt() - anagram[1].toLowerCase().chars().reduce((i, j) -> i + j).getAsInt();
        System.out.println(v);

    }
}

package practice.code.java8;

public class Add2IntegersUsingLambda {

    public static void main(String[] args) {

        Addition sum = (a, b) -> a + b;
        System.out.println(sum.add(1, 2));

    }

    @FunctionalInterface
    public interface Addition {
        int add(int a, int b);
    }


}

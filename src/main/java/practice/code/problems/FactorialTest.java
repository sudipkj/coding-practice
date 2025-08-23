package practice.code.problems;

public class FactorialTest {

    public static void main(String[] args) {
        System.out.println(getFactorialValue(5));
    }

    public static int getFactorialValue(int n){
        if(n == 1){
           return 1 ;
        }else {

            return n * getFactorialValue(n-1);
        }
    }
}

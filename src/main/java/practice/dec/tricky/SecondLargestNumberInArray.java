package practice.dec.tricky;

public class SecondLargestNumberInArray {


    public static void main(String[] args) {
        int[] array = {10, 9, 14, 16, 6, 2, 7, 5, 14, 19, 5};

        int largest = array[0];
        int slargest = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > largest) {
                slargest= largest;
                largest = array[i];
            }
        }
        System.out.println(largest);
        System.out.println(slargest);
    }
}

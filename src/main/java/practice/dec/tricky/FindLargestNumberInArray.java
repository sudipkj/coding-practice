package practice.dec.tricky;

public class FindLargestNumberInArray {
    public static void main(String[] args) {
        int[] array = {10, 9, 14, 6, 6, 2, 7, 5, 14};
        int largest = array[0];

        for (int i = 1; i < array.length; i++) {
            if(array[i]> largest){
                largest = array[i];
            }
        }
        System.out.println("Largest Number is : " + largest);
    }
}

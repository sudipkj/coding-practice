package practice.nov.tricky;

public class SecondLargestNumberInArray {

    public static void main(String[] args) {
        int[] array = {10, 9, 14, 6, 6, 2, 7, 5, 14};

        int largest = array[0];
        int slargest = -1;

        for(int i = 0; i< array.length;i++ ){
            if(array[i] > largest ){
                slargest = largest;
                largest= array[i];
            }
            if(array[i]< largest && array[i]> slargest){
                slargest = array[i];
            }
            System.out.println("value of I " + array[i] + " Largest : " + largest + " slargest: " + slargest);
        }
        System.out.println("slargest number using optimal solution with O(n) " + slargest);
    }
}

package practice.dec.lambda;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class Endava {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,7,9,10,8, 5);

        //
        List<Integer> newList = IntStream.range(0,list.size()).filter(i-> (i +1 )%3 ==0)
                .mapToObj(i-> list.get(i)).map(i->i*i).toList();

        newList.stream().forEach(System.out:: println);


    }
}

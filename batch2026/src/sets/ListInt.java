package sets;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ListInt {
    public static void main(String[] args) {
        List<Integer> list = List.of(1, 8, 2, 12, 3, 21, 33, 4, 5, 10, 11, 16);

        //creates new list for even numbers
        List<Integer> evens = list.stream()
                .filter(i-> i%2==0)
                .sorted()
                //.sorted(Comparator.reverseOrder()) reverse order
                .distinct() //no duplicates
                .collect(Collectors.toList());

        System.out.println(evens);
    }
}

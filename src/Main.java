import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(5, 23, 6, 0, 12, 123, 6, 5, 1, 99, 3, 4, 1, 2);
        int list1 = list.stream().mapToInt(Integer::intValue).sum();
        System.out.println("Листин сумасы : " + list1);
        System.out.print("Арфметикалык саны : ");
        list.stream().mapToInt(i -> i).average().ifPresent(System.out::println);
        Set<Integer> sortPovSifr = list.stream().filter(i -> Collections.frequency(list, i) > 1)
                .collect(Collectors.toSet());
        System.out.println("повторные цифры : " + sortPovSifr);
    }
}
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class O7Reduce {

    public static void main(String[] args) {
        List<Integer> tall = Arrays.asList(4, 3, 1, 8, 100, 55, 29, 111);

        // Average, Sum, Min, Max, Count, Reduce

        System.out.println(tall.stream().count());

        System.out.println(tall.stream()
                .mapToInt(i -> i)
                .average()
                .getAsDouble());


        System.out.println(tall.stream()
                .max((a, b) -> a.compareTo(b))
                .get());


        System.out.println(tall.stream()
                .min(Integer::compare)
                .get());

        System.out.println(tall.stream()
                .reduce((sum, i) -> sum * i));

        System.out.println(tall.stream()
                .reduce((sum, i) -> sum * i));

    }
}

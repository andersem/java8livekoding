import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class O9ParallellStream {

    public static void main(String[] args) {
        List<Integer> tall = Arrays.asList(1, 2, 3, 4, 5);

        // Bruk parallellStream til å forbedre ytelsen

        System.out.println(tall.stream()
                .map(t -> {
                    try {
                        Thread.sleep(1000);
                        return t * 3;
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    return t;
                })
                .collect(Collectors.toList()));
    }
}

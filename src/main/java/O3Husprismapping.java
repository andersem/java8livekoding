import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class O3Husprismapping {
    public static void main(String[] args) {
        List<Integer> huspriser = Arrays.asList(
                3_200_000, 2_900_000, 3_500_500, 4_000_000, 5_100_500);

        // Boligprisene i Oslo m/ Bærum steg 12.7% fra 2. kvartal 2015 til 2. kvartal 2016
        // Gitt en liste med priser på leiligheter i 2015, finn gjennomsnittsprisen
        // i 2016

        // Finn deretter maks

        System.out.println(huspriser.stream()
                .mapToDouble(pris -> pris * 1.127)
                .average()
                .getAsDouble());

    }
}

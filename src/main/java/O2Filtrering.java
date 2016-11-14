import java.util.*;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class O2Filtrering {

    public static void main(String[] args) {
        List<String> liste = Arrays.asList(
                "a1", "a2", "a3", "a4",
                "b1", "b2", "b3",
                "c1", "c2", "c3", "c4", "c4", "c11");

        // Finn alle strenger i lista som begynner med a
        List<String> starterMedA = liste.stream()
                .filter(s -> s.startsWith("a"))
                .collect(Collectors.toList());

        // Finn alle strenger i lista som er nr 1 for den bokstaven
        List<String> nr1ForBokstaven = liste.stream()
                .filter(s -> s.contains("1"))
                .filter(s -> s.length() == 2)
                .collect(Collectors.toList());

        // Finn første streng som inneholder 3
        String foersteMed3 = liste.stream()
                .filter(s -> s.contains("3"))
                .findFirst()
                .get();

        // Fjern duplikater
        List<String> ikkeDuplikater = liste.stream()
                .distinct()
                .collect(Collectors.toList());

        // Finn gjennomsnittlig antall per bokstav
        Map<String, Long> gruppertPerBokstav = liste.stream()
                .collect(
                        Collectors.groupingBy(
                                s -> s.substring(0, 1),
                                Collectors.counting()));


    }
}

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class O8Flatmap {
    public static void main(String[] args) {
        List<Utvikler> utviklere = Arrays.asList(
                new Utvikler("Arne", Arrays.asList("Java", "Python", "JavaScript")),
                new Utvikler("Carlos", Arrays.asList("Java", "JavaScript")),
                new Utvikler("Zuckerberg", Arrays.asList("PHP", "JavaScript")),
                new Utvikler("Gates", Arrays.asList("BASIC", "C"))
        );

        // Få en liste over alle språkene folk i bedriften kan


    }

    static class Utvikler {
        public final String navn;
        public final List<String> spraak;

        Utvikler(String navn, List<String> spraak) {
            this.navn = navn;
            this.spraak = spraak;
        }
    }
}



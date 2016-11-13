import java.util.Arrays;
import java.util.List;

public class O10Diverse {
    public static void main(String[] args) {
        List<Biltype> biltyper = Arrays.asList(
                new Biltype("VW", "Tyskland", 9_259_506),
                new Biltype("Toyota", "Japan", 8_565_175),
                new Biltype("Hyundai", "South Korea", 6_909_194),
                new Biltype("General Motors", "United States", 6_733_192),
                new Biltype("Honda", "Japan", 4_263_239),
                new Biltype("Nissan", "Japan", 4_090_577),
                new Biltype("Ford", "United States", 3_317_048),
                new Biltype("Suzuki", "Japan", 2_452_573),
                new Biltype("Peugeot", "Frankrike", 2_445_889),
                new Biltype("Renault", "Frankrike", 2_347_913)
        );

        // Grupper biltypene etter land, Map<String, Biltype>
        // Hvem produserer flest biler?
        // Hvilket land produserer flest biler?
        // Hva er gjennomsnittet produserte biler per land?
        // Noe annet?


    }

    static class Biltype {
        public final String type;
        public final String land;
        public final int antallProduserteBiler;

        Biltype(String type, String land, int antallProduserteBiler) {
            this.type = type;
            this.land = land;
            this.antallProduserteBiler = antallProduserteBiler;
        }
    }
}

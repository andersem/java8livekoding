import java.util.Arrays;
import java.util.List;

public class SorteringMedComparator {

    public static void main(String[] args) {
        List<Noe> listeMedNoe = Arrays.asList(new Noe("A"), new Noe("C"), new Noe("B"));


    }

    public static class Noe {
        public final String name;

        Noe(String name) {
            this.name = name;
        }
    }
}

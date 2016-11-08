import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterExample {
    public static void main(String[] args) {
        List<String> biltyper = Arrays.asList("VW", "Audi", "Jaguar");


        List<String> biltyperSomBegynnerPaaBokstavenA = new ArrayList<>();

        for (String biltype : biltyper) {
            if (biltype.startsWith("A")) {
                biltyperSomBegynnerPaaBokstavenA.add(biltype);
            }
        }

        System.out.println("biltyperSomBegynnerPaaBokstavenA = " + biltyperSomBegynnerPaaBokstavenA);

        List<String> biltyperSomBegynnerPaaBokstavenAMedStreams = biltyper.stream()
                .filter(biltype -> biltype.startsWith("A"))
                .collect(Collectors.toList());

        System.out.println("biltyperSomBegynnerPaaBokstavenAMedStreams = " + biltyperSomBegynnerPaaBokstavenAMedStreams);


    }
}

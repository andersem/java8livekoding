import dataklasser.Bil;
import dataklasser.Kjoeretoy;

import java.util.function.Supplier;

public class O6Supplier {
    public static void main(String[] args) {
        // Lag en metode som tar inn en Supplier<? extends Kjoeretoy>.
        // Bruk den med et kjøretøy og en bil

        ikkeGjoerNoe(() -> new Kjoeretoy());
        ikkeGjoerNoe(() -> new Bil());




    }

    public static void ikkeGjoerNoe(Supplier<? extends Kjoeretoy> supplier) {
        Kjoeretoy kjoeretoy = supplier.get();
        kjoeretoy.kjoer();
    }
}

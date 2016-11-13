import dataklasser.Skattekortsoeknad;
import dataklasser.SkattekortsoeknadDTO;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class O4SkattekortsoeknadBehandler {

    public static void main(String[] args) {
        List<SkattekortsoeknadDTO> skattekortsoeknadDTOer =
                Arrays.asList(
                        new SkattekortsoeknadDTO("1", 450_000, 300_000, 78_000),
                        new SkattekortsoeknadDTO("2", 550_000, 343_000, 70_000),
                        new SkattekortsoeknadDTO("3", 650_000, 250_000, 20_000)
                );

        // Gjør alle DTOene om til interne objekter.
        // Filtrer ut

        List<Skattekortsoeknad> soeknader = skattekortsoeknadDTOer.stream()
                .map(soeknadDTO -> new Skattekortsoeknad(
                        soeknadDTO.norskIdentifikator,
                        soeknadDTO.inntektTotalt,
                        new Skattekortsoeknad.HittilIAar(
                                soeknadDTO.inntektHittil,
                                soeknadDTO.betaltSkatt)))
                .collect(Collectors.toList());

        soeknader.stream()
                .filter(soeknad ->
                        (soeknad.inntektTotalt - soeknad.hittilIAar.inntektHittil) / soeknad.inntektTotalt > 0.6)
                .forEach(soeknad -> System.out.println("Sender til manuell behandling: " + soeknad));
    }
}


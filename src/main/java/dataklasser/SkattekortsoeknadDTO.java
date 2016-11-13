package dataklasser;

public class SkattekortsoeknadDTO {
    public final String norskIdentifikator;
    public final double inntektTotalt;
    public final double inntektHittil;
    public final double betaltSkatt;

    public SkattekortsoeknadDTO(String norskIdentifikator, double inntektTotalt, double inntektHittil, double betaltSkatt) {
        this.norskIdentifikator = norskIdentifikator;
        this.inntektTotalt = inntektTotalt;
        this.inntektHittil = inntektHittil;
        this.betaltSkatt = betaltSkatt;
    }
}

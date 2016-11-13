package dataklasser;

public class Skattekortsoeknad {
    public final String norskIdentifikator;
    public final double inntektTotalt;
    public final HittilIAar hittilIAar;

    public Skattekortsoeknad(
            String norskIdentifikator,
            double inntektTotalt,
            HittilIAar hittilIAar) {
        this.norskIdentifikator = norskIdentifikator;
        this.inntektTotalt = inntektTotalt;
        this.hittilIAar = hittilIAar;
    }

    @Override
    public String toString() {
        return "Skattekortsoeknad{" +
                "norskIdentifikator='" + norskIdentifikator + '\'' +
                ", inntektTotalt=" + inntektTotalt +
                ", hittilIAar=" + hittilIAar +
                '}';
    }

    public static class HittilIAar {
        public final double inntektHittil;
        public final double betaltSkatt;

        public HittilIAar(double inntektHittil, double betaltSkatt) {
            this.inntektHittil = inntektHittil;
            this.betaltSkatt = betaltSkatt;
        }

        @Override
        public String toString() {
            return "HittilIAar{" +
                    "inntektHittil=" + inntektHittil +
                    ", betaltSkatt=" + betaltSkatt +
                    '}';
        }
    }
}

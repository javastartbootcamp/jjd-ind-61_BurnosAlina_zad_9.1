package pl.javastart.task;

public class PodatekWgSkaliPodatkowej extends FormaOpodatkowania {

    private static final String FORMA_OPODATKOWANIA = "Podatek wedlug skali podatkowej";
    private static final double KWOTA_WOLNA_OD_PODATKU = 10_000;
    private static final double KWOTA_OPODATKOWANA_18 = 100_000;

    @Override
    public double wyliczPodatek(double przychody, double koszty) {
        double dochod = przychody - koszty;
        double podatek = 0;
        if (dochod > 0) {
            if (dochod > KWOTA_WOLNA_OD_PODATKU && dochod < KWOTA_OPODATKOWANA_18) {
                podatek = (dochod - KWOTA_WOLNA_OD_PODATKU) * 0.18;
            } else if (dochod > KWOTA_OPODATKOWANA_18) {
                podatek = ((KWOTA_OPODATKOWANA_18 - KWOTA_WOLNA_OD_PODATKU) * 0.18) +
                        (dochod - KWOTA_OPODATKOWANA_18) * 0.32;
            }
        }
        return podatek;
    }

    @Override
    String getInfo() {
        return FORMA_OPODATKOWANIA;
    }
}

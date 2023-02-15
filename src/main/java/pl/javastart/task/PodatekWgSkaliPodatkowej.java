package pl.javastart.task;

public class PodatekWgSkaliPodatkowej extends FormaOpodatkowania {

    private static final String NAZWA_FORMY_OPODATKOWANIA = "Podatek wedlug skali podatkowej";
    private static final double KWOTA_WOLNA_OD_PODATKU = 10_000;
    private static final double KWOTA_OPODATKOWANA_18 = 100_000;
    private static final double STAWKA_PODATKU_18 = 0.18;
    private static final double STAWKA_PODATKU_32 = 0.32;

    @Override
    public double wyliczPodatek(double przychody, double koszty) {
        double dochod = przychody - koszty;
        double podatek = 0;
        if (dochod > KWOTA_WOLNA_OD_PODATKU && dochod < KWOTA_OPODATKOWANA_18) {
            podatek = (dochod - KWOTA_WOLNA_OD_PODATKU) * STAWKA_PODATKU_18;
        } else if (dochod > KWOTA_OPODATKOWANA_18) {
            podatek = ((KWOTA_OPODATKOWANA_18 - KWOTA_WOLNA_OD_PODATKU) * STAWKA_PODATKU_18) +
                    (dochod - KWOTA_OPODATKOWANA_18) * STAWKA_PODATKU_32;
        }

        return podatek;
    }

    @Override
    String getInfo() {
        return NAZWA_FORMY_OPODATKOWANIA;
    }
}

package pl.javastart.task;

public class PodatekLiniowy extends FormaOpodatkowania {

    private static final String NAZWA_FORMA_OPODATKOWANIA = "Podatek liniowy";

    private static final double STAWKA_PODATKU_LINIOWEGO = 0.19;

    @Override
    public double wyliczPodatek(double przychody, double koszty) {
        double dochod = przychody - koszty;
        return dochod * STAWKA_PODATKU_LINIOWEGO;
    }

    @Override
    String getInfo() {
        return NAZWA_FORMA_OPODATKOWANIA;
    }
}

package pl.javastart.task;

public class PodatekLiniowy extends FormaOpodatkowania {

    private static final String FORMA_OPODATKOWANIA = "Podatek liniowy";

    @Override
    public double wyliczPodatek(double przychody, double koszty) {
        double dochod = przychody - koszty;
        return dochod * 0.19;
    }

    @Override
    String getInfo() {
        return FORMA_OPODATKOWANIA;
    }
}

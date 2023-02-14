package pl.javastart.task;

public class NaCzarno extends FormaOpodatkowania {

    private static final String FORMA_OPODATKOWANIA = "Na czarno";

    @Override
    public double wyliczPodatek(double przychody, double koszty) {
        return super.wyliczPodatek(przychody, koszty);
    }

    @Override
    String getInfo() {
        return FORMA_OPODATKOWANIA;
    }
}

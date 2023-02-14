package pl.javastart.task;

public class RyczaltEwidencjonowany extends FormaOpodatkowania {

    private static final String FORMA_OPODATKOWANIA = "Ryczalt ewidencjonowany";

    @Override
    public double wyliczPodatek(double przychody, double koszty) {
        return przychody * 0.15;
    }

    @Override
    String getInfo() {
        return FORMA_OPODATKOWANIA;
    }
}

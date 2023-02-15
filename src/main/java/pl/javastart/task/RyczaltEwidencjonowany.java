package pl.javastart.task;

public class RyczaltEwidencjonowany extends FormaOpodatkowania {

    private static final String NAZWA_FORMY_OPODATKOWANIA = "Ryczalt ewidencjonowany";

    private static final double STAWKA_PODATKU_RYCZALTOWEGO = 0.15;

    @Override
    public double wyliczPodatek(double przychody, double koszty) {
        return przychody * STAWKA_PODATKU_RYCZALTOWEGO;
    }

    @Override
    String getInfo() {
        return NAZWA_FORMY_OPODATKOWANIA;
    }
}

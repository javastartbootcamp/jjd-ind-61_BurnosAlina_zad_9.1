package pl.javastart.task;

import java.util.Arrays;

public class Firma {

    private String nazwa;
    private FormaOpodatkowania formaOpodatkowania;

    private Przychod[] przychody = new Przychod[10];
    private Wydatek[] wydatki = new Wydatek[10];

    public Firma(String nazwa, FormaOpodatkowania formaOpodatkowania) {
        this.nazwa = nazwa;
        this.formaOpodatkowania = formaOpodatkowania;
    }

    public void wyswietlPodsumowanie() {
        double sumaPrzychodow = zsumujPrzychody();
        double sumaWydatkow = zsumujWydatki();
        System.out.printf("======= Firma: %s ===========\n", nazwa);
        System.out.printf("Forma opodatkowania: %s\n", formaOpodatkowania.getInfo());
        System.out.printf("Suma przychodów: %.2f zł\n", sumaPrzychodow);
        System.out.printf("Suma wydatków: %.2f zł\n", sumaWydatkow);
        System.out.printf("Podatek do zapłacenia: %.2f zł",
                formaOpodatkowania.wyliczPodatek(sumaPrzychodow, sumaWydatkow));
        System.out.print("\n\n");
    }

    private double zsumujWydatki() {
        double sumaWydatkow = 0;
        for (Wydatek wydatek : wydatki) {
            if (wydatek != null) {
                sumaWydatkow += wydatek.getWartosc();
            }
        }
        return sumaWydatkow;
    }

    private double zsumujPrzychody() {
        double sumaPrzychodow = 0;
        for (Przychod przychod : przychody) {
            if (przychod != null) {
                sumaPrzychodow += przychod.getWartosc();
            }
        }
        return sumaPrzychodow;
    }

    public void dodajPrzychod(Przychod przychod) {
        zapewnienieMiejscaWtabeliPrzychodow();
        for (int i = 0; i < przychody.length; i++) {
            if (przychody[i] == null) {
                przychody[i] = przychod;
                break;
            }
        }
    }

    public void dodajWydatek(Wydatek wydatek) {
        zapewnienieMiejscaWtabeliWydatkow();
        for (int i = 0; i < wydatki.length; i++) {
            if (wydatki[i] == null) {
                wydatki[i] = wydatek;
                break;
            }
        }
    }

    private void zapewnienieMiejscaWtabeliWydatkow() {
        if (wydatki[wydatki.length - 1] != null) {
            wydatki = Arrays.copyOf(wydatki, wydatki.length * 2);
        }
    }

    private void zapewnienieMiejscaWtabeliPrzychodow() {
        if (przychody[przychody.length - 1] != null) {
            przychody = Arrays.copyOf(przychody, przychody.length * 2);
        }
    }
}

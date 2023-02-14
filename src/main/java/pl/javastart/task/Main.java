package pl.javastart.task;

public class Main {

    public static void main(String[] args) {
        Firma firma = new Firma("JanuszPOL", new PodatekLiniowy());

        firma.dodajPrzychod(new Przychod("Remont Mieszkania", 20_000));
        firma.dodajWydatek(new Wydatek("Gładzie i farby", 1_000));

        firma.wyswietlPodsumowanie();

        Firma janNowakServices = new Firma("Jan Nowak IT Services", new PodatekWgSkaliPodatkowej());

        janNowakServices.dodajPrzychod(new Przychod("Programowanie", 150_000));
        janNowakServices.dodajWydatek(new Wydatek("Energetyki", 20_000));

        janNowakServices.wyswietlPodsumowanie();
    }

}

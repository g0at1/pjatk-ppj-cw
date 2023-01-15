package cwiczenia.ppj21;

public class Osoba {
    private String imie;
    private int wiek;

    public Osoba(String imie, int wiek) {
        this.imie = imie;
        this.wiek = wiek;
    }

    public void wyswietl() {
        System.out.println(this.imie + ", " + this.wiek);
    }
}

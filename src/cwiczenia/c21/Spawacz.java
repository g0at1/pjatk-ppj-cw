package cwiczenia.c21;

public class Spawacz extends Osoba {
    private int stazPracy;
    private String imie;
    private int wiek;

    Spawacz(String imie, int wiek, int stazPracy) {
        super(imie, wiek);
        this.stazPracy = stazPracy;
    }

    public void wyswietl() {
        System.out.println(imie + ", " + this.wiek + ", " + this.stazPracy);
    }
}

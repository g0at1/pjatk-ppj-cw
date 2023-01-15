package cwiczenia.c22;

import java.util.ArrayList;

public class Smartfon extends Komorka {
    private Osoba[] znajomi;
    private String numer;
    private ArrayList<Osoba> friends = new ArrayList<>();

    public Smartfon(Osoba[] znajomi) {
        this.znajomi = znajomi;
    }

    public void zadzwon(String numer, Osoba o1) {
        super.zadzwon(numer);
        Osoba[] znajomi = {o1};
    }



    public void wyswietlHistoriePolaczen() {
        super.wyswietlHistoriePolaczen();

    }
}

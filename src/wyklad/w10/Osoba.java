package wyklad.w10;

public class Osoba {
    String imie;
    int rokUrodzenia;

    Osoba(String imie, int rokUrodzenia) {
        this.imie = imie;
        this.rokUrodzenia = rokUrodzenia;
    }

    Osoba(String imie) {
        this.imie = imie;
        rokUrodzenia = 1900;
    }

    public String zwrocImie() {
        return imie;
    }

    public int zwrocWiek() {
        return 2022 - rokUrodzenia;
    }

}

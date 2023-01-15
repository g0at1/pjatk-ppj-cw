package wyklad.w08;

public class Osoba {
    String imie;
    int rokUrodzenia;

    Osoba(String imie, int rokUrodzenia) {
        this.imie = imie;
        this.rokUrodzenia = rokUrodzenia;
    }

    Osoba(String imie) {
        this.imie = imie;
        rokUrodzenia = 1990;
    }

    public String zwrocImie() {
        return this.imie;
    }

    public int zwrocWiek() {
        return 2022 - this.rokUrodzenia;
    }

    public static Osoba zwrocStarszaOsobe(Osoba o1, Osoba o2) {
        if (o1.zwrocWiek() < o2.zwrocWiek())
            return o1;
        else
            return o2;
    }

    public static Osoba zwrocNajstarszaOsobe(Osoba[] tab) {
        Osoba najstarsza = tab[0];

        for (int i = 1; i < tab.length; i++) {
            if (tab[i].zwrocWiek() > najstarsza.zwrocWiek())
                najstarsza = tab[i];
        }
        return najstarsza;

    }

    public void show() {
        System.out.println(this.imie + ", " + this.zwrocWiek());
    }
}

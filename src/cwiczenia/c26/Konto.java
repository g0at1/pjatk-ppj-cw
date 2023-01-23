package cwiczenia.c26;

public class Konto extends RachunekBankowy {
    protected double oprocentowanie;

    public Konto(Osoba wlasciciel, double stan, double oprocentowanie) {
        super(wlasciciel, stan);
        this.oprocentowanie = oprocentowanie;

    }
}

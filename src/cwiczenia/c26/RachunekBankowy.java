package cwiczenia.c26;

public class RachunekBankowy {
    protected Osoba wlasciciel;
    protected double stan;

    public RachunekBankowy(Osoba wlasciciel, double stan) {
        this.wlasciciel = wlasciciel;
        this.stan = stan;
    }


    public void wplata(double kwota) {
        if(kwota > 0) {
            stan += kwota;
        }
        else throw new IllegalStateException("Bledna operacja");
    }

    public double getStan() {
        return stan;
    }



    public void wyplata(double kwota) {
        if(getStan() > 0 && kwota <= getStan()) {
            stan -= kwota;
        }
        else throw new IllegalStateException("Bledna operacja");
    }

    public void przelew(RachunekBankowy rach, double kwota) {
        if(getStan() > 0 && kwota <= getStan()) {
            stan -= kwota;
            rach.stan += kwota;
        }
        else throw new IllegalStateException("Bledna operacja");
    }
}

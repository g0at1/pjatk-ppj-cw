package cwiczenia.c26;

public class KontoVip extends Konto {
    protected double limitDebetu;

    public KontoVip(Osoba wlasciciel,
                    double stan,
                    double oprocentowanie,
                    double limitDebetu) {
        super(wlasciciel, stan, oprocentowanie);
        this.limitDebetu = limitDebetu;
    }

    @Override
    public void wyplata(double kwota) {
        if(getStan() <= limitDebetu && kwota <= limitDebetu) {
            stan -= kwota;
        }
        else throw new IllegalStateException("Bledna operacja");
    }

    @Override
    public void wplata(double kwota) {
        if(kwota > 0) {
            stan += kwota;
        }
        else throw new IllegalStateException("Bledna operacja");
    }
}

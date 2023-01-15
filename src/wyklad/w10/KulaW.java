package wyklad.w10;

public class KulaW {
    private double r;

    KulaW(Walec w) {
        r = Math.min(w.getPromien(), w.getWysokosc()/2);
    }

    KulaW(Kwadrat k) {
        r = k.getBok()/2;
    }

}

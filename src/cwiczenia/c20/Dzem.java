package cwiczenia.c20;

public class Dzem {
    private String smak;
    private double waga;

    Dzem(String smak, double waga) {
        this.smak = smak;
        this.waga = waga;
    }

    Dzem(double waga) {
        this("No name", waga);
    }

    Dzem(String smak) {
        this(smak, 100.0);
    }

    public String getSmak() {
        return smak;
    }

    public void setSmak(String smak) {
        this.smak = smak;
    }

    public double getWaga() {
        return waga;
    }

    public void setWaga(double waga) {
        this.waga = waga;
    }
}

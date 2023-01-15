package cwiczenia.c23;

public class Owoc {
    private String nazwa;
    private double masa;

    public Owoc(String nazwa,
                double masa) {
        this.nazwa = nazwa;
        this.masa = masa;
    }

    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public double getMasa() {
        return masa;
    }

    public void setMasa(double masa) {
        this.masa = masa;
    }



}

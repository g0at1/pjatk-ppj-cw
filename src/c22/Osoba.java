package c22;

public class Osoba {
    String imie;
    String nazwisko;
    String numer;

    public Osoba(String imie, String nazwisko, String numer) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.numer = numer;
    }

    public void show() {
        System.out.println(this.imie + " " + this.nazwisko + " " + this.numer);
    }
}

package w10;

public class Walec {
    private int promien;
    private int wysokosc;

    Walec(int promien, int wysokosc) {
        this.promien = promien;
        this.wysokosc = wysokosc;
    }

    public void show() {
        System.out.println(Math.PI * promien * promien);
        System.out.println(Math.PI * promien * promien * wysokosc);
    }

    public double getPromien() {
        return promien;
    }

    public double getWysokosc() {
        return wysokosc;
    }
}

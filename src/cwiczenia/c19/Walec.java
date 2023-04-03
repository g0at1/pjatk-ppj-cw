package cwiczenia.c19;

public class Walec {
    private int promien;
    private int wysokosc;

    Walec(int promien, int wysokosc) {
        this.promien = promien;
        this.wysokosc = wysokosc;
    }

    public void show() {
        System.out.println((2 * Math.PI * Math.pow(promien, 2)) + (2 * Math.PI * promien * wysokosc));
        System.out.println(Math.PI * Math.pow(promien, 2) * wysokosc);
    }
}

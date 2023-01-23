package cwiczenia.c26;

public class Main {
    public static void main(String[] args) {
        Osoba o1 = new Osoba("Test", "Testowy");
        Osoba o2 = new Osoba("Michal", "Test");
        RachunekBankowy r1 = new RachunekBankowy(o1, 500);
        RachunekBankowy r2 = new RachunekBankowy(o2, 20);

        KontoVip v1 = new KontoVip(o1, 0, 20, 200);

        r1.przelew(r2, 500);
        System.out.println(r1.getStan());
        System.out.println(r2.getStan());


        v1.wyplata(200);
        v1.wplata(20);
        System.out.println(v1.getStan());

    }
}

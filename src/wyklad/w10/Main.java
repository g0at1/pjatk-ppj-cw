package wyklad.w10;

public class Main {
    public static void main(String[] args) {
        Kwadrat kwadrat = new Kwadrat(4);
        kwadrat.show();

        Walec walec = new Walec(2, 4);
        walec.show();

        Osoba osoba = new Osoba("Karol", 2001);

        System.out.println(osoba.zwrocWiek());
        System.out.println(osoba.zwrocImie());
    }
}

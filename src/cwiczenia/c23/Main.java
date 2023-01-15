package cwiczenia.c23;

public class Main {
    public static void main(String[] args) {

        Owoc[] tab = new Owoc[100];
        int jablka = 0, pomarancze = 0, gruszki = 0;
        boolean cont = true;
        double masa = 0;

        for (int i = 0; i < tab.length && cont; i++) {
            tab[i] = Drzewo2.zerwijOwoc();
            masa += tab[i].getMasa();
            if (tab[i] instanceof Jablko) {
                jablka++;
            }
            else if (tab[i] instanceof Pomarancza) {
                pomarancze++;
            }
            else {
                gruszki++;
            }
            if (masa >= 5000) {
                cont = false;
            }
        }

        System.out.println("===================" + " Zadanie 1: ");
        System.out.println(
                "Jablka: " + jablka + "\n" +
                "Pomarancze: " + pomarancze + "\n" +
                "Gruszki: " + gruszki
        );
        System.out.println("====================");

        Jablko j1 = new Jablko();
        //System.out.println(j1.getMasa());

        DetektorDymu d1 = new DetektorDymu();

//        ZADANIE 3:
//        try {
//            d1.sprawdz();
//        } catch (Alarm e) {
//            System.err.println(e.getMessage());
//        }


        Rakieta r1 = new Rakieta("Testowa", 150);
        r1.zatankuj();
        System.out.println(r1.getWagaPaliwa());

        try {
            r1.start();
        } catch(Exception e) {
            System.err.println(e.getMessage());
        }


    }
}

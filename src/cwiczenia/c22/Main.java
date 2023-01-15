package cwiczenia.c22;

public class Main {
    public static void main(String[] args) {

        Telefon t1 = new Telefon();
        //t1.zadzwon("514 123 594");
        //t1.wyswietlHistoriePolaczen();


        Komorka k1 = new Komorka();
//        k1.zadzwon("513 123 594");
//        k1.zadzwon("214 125 124");
//        k1.wyswietlHistoriePolaczen();
        k1.zadzwon("123 456 789");
        k1.zadzwon("987 654 321");
        k1.wyswietlHistoriePolaczen();

        Osoba o1 = new Osoba("Jan", "Testalski", "513 123 594");

        Osoba[] tab = {o1};





        Smartfon s1 = new Smartfon(tab);
        //s1.zadzwon("123 456 789", o1);
//        s1.zadzwon("987 654 321");
//        s1.wyswietlHistoriePolaczen();
//        for (int i = 0; i < tab.length; i++) {
//            tab[i].show();
//        }


    }
}
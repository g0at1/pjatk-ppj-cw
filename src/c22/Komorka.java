package c22;


import java.util.ArrayList;

public class Komorka extends Telefon {
    protected String[] tab = new String[10];
    protected int n = 0;
    protected ArrayList<String> arr = new ArrayList<>();


    @Override
    protected void zadzwon(String numer) {
        arr.add(numer);


    }

    @Override
    protected void wyswietlHistoriePolaczen() {
//        for (String val : arr) {
//            System.out.println(val + " ");
//        }
        System.out.println(arr);
    }


}

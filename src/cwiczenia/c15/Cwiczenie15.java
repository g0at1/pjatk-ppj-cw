package cwiczenia.c15;

public class Cwiczenie15 {
    public static void main(String[] args) {
        String str = "Testowy string   ";
 
        int wrt = 5;

        show(5);

        
        modifyValue(wrt);

        charCount(str);


    }

    public static void show (int x) {
        System.out.println(x);
    }

    public static void modifyValue(int x) {
        System.out.println(x);
        x *= 5;
        System.out.println(x);
    }

    

    public static void charCount(String str) {
        int[] count = new int[255];
        char ch[] = new char[str.length()]; //tablica z dlugoscia stringa
        int found;
        
        for (int i = 0; i < str.length(); i++) //liczenie charow
            count[str.charAt(i)]++;
 
        for (int i = 0; i < str.length(); i++) {
            ch[i] = str.charAt(i);
            found = 0;
            for (int j = 0; j <= i; j++) {
                if (ch[i] == ch[j])
                    found++;
            }
            if (found == 1) //wypisz znak tylko raz 
                System.out.println(str.charAt(i) + " wystepuje " + count[str.charAt(i)] + " razy.");

                
        }

    }


}

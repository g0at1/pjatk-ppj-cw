package cwiczenia.c11;

import java.util.Scanner;

public class cwiczenie11 {
    public static void main(String[] args) {
        //zadanie1();

        //zadanie2();

        //zadanie3();

        //zadanie4();

        


    }

    public static void zadanie1() {
        double[] tab = new double[10];

        // 1.A i 1.B
        /*for (int i = 0; i < tab.length; i++)
        {
            tab[i] = Math.random();
            System.out.print("[" + tab[i] + ", " + "]");
        }
        */

        // 1.C
        /*for (int i = 0; i < tab.length; i++)
        {
            tab[i] = Math.random();
            if(i % 2 == 0)
                System.out.print(tab[i]);
        }
        */

        
        // 1.D
        /*for (int i = 0; i < tab.length; i++)
        {
            tab[i] = (int)(Math.random() * 10);
            if(i % 2 == 0)
                System.out.print(tab[i] + ", ");
        }
        */
        
        
        /*System.out.print("[");
        for (double val : tab)
            System.out.print(val + ", ");
        System.out.print("]");
        */
            
        
            
        
    }

    public static void zadanie2() {
        char[] tab = new char[3];
        tab[0] = 'C';
        tab[1] = 'B';
        tab[2] = 'A';

        int minVal = tab[0];
        int index = 0;

        for (int i = 0; i < tab.length; i++)
            if(minVal > tab[i])
            {
                minVal = tab[i];
                index = i;
            }

        System.out.println("Najmniejsza wartość " + minVal + " znajduje sie w indeksie nr " + index);
    }

    public static void zadanie3() {
        Scanner scanner = new Scanner(System.in);

        char[] tab = new char[5];
        int licznik = 0;

        System.out.print("Proszę podac znak: ");
        char c = scanner.next().toUpperCase().charAt(0);

        for (int i = 0; i < tab.length; i++)
        {
            tab[i] = (char)('A' + (int)(Math.random()*('Z' - 'A' + 1)));
            if (tab[i] == c)
            {
                tab[i] = '0';
                licznik += 1;
            }
        }
        System.out.print("[");
        for (char val : tab)
                System.out.print(val + ", ");
        System.out.println("]");
        
        System.out.println("Ilość wystąpień znaku " + c + ": " + licznik);
        

        
        
    }

    
}

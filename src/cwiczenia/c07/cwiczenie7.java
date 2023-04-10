package cwiczenia.c07;

import java.util.Scanner;

public class cwiczenie7 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        //ZADANIE1
        /* 
        int a = 1, b = 2;

        boolean w1 = (!(a < b) && !(a > b));

        boolean w2 = (a == b);

        System.out.println(w1 + " = " + w2);
        */

        //ZADANIE  3
        /* 
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
    
        if ((a + b + c) == 180)
        {
            if (a < 90 && b < 90 && c < 90)
                System.out.println("Ostrokątny");
            else
                System.out.println("Moze istniec, ale nie ostrokatny");
        }
        else 
            System.out.println("Nie moze istniec");
        */

        
        //ZADANIE 4
        /* 
        char ch = scanner.next().charAt(0);

        if (ch == 'a' || ch == 'e' || ch == 'y' || ch == 'i' || ch == 'o' || ch == 'ą' || ch == 'ę' || ch == 'u' || ch == 'ó')
            System.out.println("Samogłoska");
        else
            System.out.println("Spółgłoska");
        */

        //ZADANIE 5
        /* 
        int month = scanner.nextInt();
        int year = scanner.nextInt();

        if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) 
            System.out.println("31 dni");
        else if (month == 4 || month == 6 || month == 9 || month == 11)
            System.out.println("30 dni");
        else if (month == 2 && year % 4 == 0 && year % 100 != 0 || year % 400 == 0)
            System.out.println("29 dni");
        else 
            System.out.println("28 dni");
        */
        
        

        
        
        
        



    }
}
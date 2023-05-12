package wyklad.w04;

import java.util.Scanner;

public
    class Main {

    public static void main(String[] args) {
        {
            int counter = 0;
            while (counter < 5)
                System.out.println("ex 1: " + counter++);

            System.out.println("ex 1 (after while):"+counter);
        }
        //===========================
        {
            int counter = 0;
            do
                System.out.println("ex 2: " + counter++);
            while (counter < 5);
        }
        //============================

        {
            boolean state = false;
            while (state)
                System.out.println("ex 3 while: "+state);

            do
                System.out.println("ex 3 do-while:");
            while (state);
        }

        //================================

        {
            for(int counter = 0; counter < 5; counter++)
                System.out.println("ex 4: "+counter);

            //System.out.println(counter);
        }

        {
            // bad example
            /*
            int counter = 0;
            for( ; ; ) {
                System.out.println("ex 5: " + counter);
                counter++;
                if(counter > 5)
                    break;
            }
            //System.out.println(counter);
             */
        }
        {
            for(int couter = 0, i = 0; couter < 5 && i > -5; couter++, i--)
                System.out.println("ex 6:"+couter);
        }
        {
            System.out.println("i\tj");
            for(int i=0; i < 3; i++)
                for(char j='A'; j < 'D'; j++)
                    System.out.println(i+"\t"+j);
        }

        {
            Scanner scanner = new Scanner(System.in);
            char ch = scanner.next().charAt(0);

            while (ch != 'q'){
                System.out.println(ch);
                ch = scanner.next().charAt(0);
            }

/*
            do{
                ch = scanner.next().charAt(0);
                System.out.println(ch);
            }while (ch != 'q');
 */
        }{
            Scanner scanner = new Scanner(System.in);
            char ch;

            while ((ch = scanner.next().charAt(0)) != 'q'){
                System.out.println(ch);
            }
        }


    }

}

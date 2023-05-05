package wyklad.w07;

import java.util.Arrays;

public
    class Main {

    public static void main(String[] args) {
        {
            System.out.println("args.length: " + args.length);

            for (String arg : args)
                System.out.println(arg);
        }

        {
            int[] tab = new int[100];
            Array.show(tab);

            System.out.println(
                Arrays.toString(tab)
            );
        }

        sum( 5 + 6, 3-2);

        {
            int a = 5;
            int b = a;

            int[] tab1 = new int[0];
            int[] tab2 = tab1;
        }

        {
            int val = 1;
            System.out.println("val:"+val);
            fun(val);
            System.out.println("val:"+val);
        }

        {
            int[] tab = {10, 20, 30, 40, 50};
            Array.show(tab);
            fun(tab);
            Array.show(tab);
        }

        {
            int[] tab;
            int[] tab1 = null;
            int[] tab2 = new int[0];
        }
    }

    public static void fun(int fVal){
        System.out.println("\tfVal:"+fVal);
        fVal = 500;
        System.out.println("\tfVal:"+fVal);
    }

    public static void fun(int[] fArr){
        Array.show(fArr);
        fArr[0] = 500;
        Array.show(fArr);

    }

    public static void sum(int a, int b){

    }


}

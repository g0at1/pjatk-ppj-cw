package cwiczenia.c24;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = 10;

        if ((number & 1 ) == 0) {
            System.out.println("Parzysta");
        }
        else {
            System.out.println("Nieparzysta");
        }

        //int num = scanner.nextInt();

        String res = "";

//        for (int i = 0; i < 32; i++) {
//            res = (num & 0b1) + res;
//            num = num >> 1;
//        }

//        System.out.println(res);

        int color = 0x35125676;
        int red = (color & 0xff000000) >> 24;
        int green = (color & 0x00ff0000) >> 16;
        int blue = (color & 0x0000ff00) >> 8;
        int alpha = (color & 0x000000ff);

//        System.out.println(
//                        "Red: " + red + "\n" +
//                        "Green: " + green + "\n" +
//                        "Blue: " + blue + "\n" +
//                        "Alpha: " + alpha
//        );

        int x = 5;
        String binaryString = Integer.toBinaryString(x);
        String reversedString = new StringBuilder(binaryString).reverse().toString();
        int reversetInt = Integer.parseInt(reversedString, 2);
        System.out.println(binaryString);
        System.out.println(reversetInt);



    }
}

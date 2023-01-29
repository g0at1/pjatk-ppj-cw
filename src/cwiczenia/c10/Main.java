package cwiczenia.c10;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//        ZADANIE XI
//        System.out.print("Podaj znak: ");
//        char inp = sc.next().charAt(0);
//        if (inp >= '0' && inp <= '9') {
//            System.out.println((int) inp - 48);
//        }
//        else if (inp >= 'A' && inp <= 'F') {
//            System.out.println((int) inp - 55);
//        }
//        else if (inp >= 'a' && inp <= 'f') {
//            System.out.println((int) inp - 87);
//        }
//        else {
//            System.out.println(-1);
//        }

//        ZADANIE XIII
//        System.out.print("Podaj liczbe: ");
//        int num = sc.nextInt();
//        int sum = 0;
//        for (int i = 1; i < num; i++) {
//            if (num % i == 0) {
//                sum += i;
//            }
//        }
//        if (sum == num) {
//            System.out.println(num + " jest liczbą doskonałą.");
//        }
//        else {
//            System.out.println(num + " nie jest liczbą doskonałą.");
//        }

//        ZADANIE XIV
//        boolean quit = false;
//        String direction = "North";
//        System.out.println(direction);
//
//        while (!quit) {
//            System.out.print("A - LEWO, D - PRAWO, Q - KONIEC: ");
//            char input = sc.next().toUpperCase().charAt(0);
//            if (input == 'A') {
//                direction = switch (direction) {
//                    case "North" -> "West";
//                    case "West" -> "South";
//                    case "South" -> "East";
//                    default -> "North";
//                };
//                System.out.println(direction);
//            }
//            else if (input == 'D') {
//                direction = switch (direction) {
//                    case "North" -> "East";
//                    case "East" -> "South";
//                    case "South" -> "West";
//                    default -> "North";
//                };
//                System.out.println(direction);
//            }
//            else if (input == 'Q') {
//                quit = true;
//            }
//            else {
//                System.out.println("Nieprawidłowy klawisz.");
//            }
//        }
    }
}

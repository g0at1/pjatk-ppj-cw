package cwiczenia.c25;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
//        FileInputStream file = new FileInputStream(
//                "/Users/michallendzion/Documents/PJATK/ZADANIA/src/cwiczenia/c25/plik.txt");
//        int[] charCount = new int[256];
//        int i;
//        while ((i = file.read()) != -1) {
//            charCount[i]++;
//        }
//        file.close();
//        System.out.println("Znaki i liczba ich wystąpień:");
//        for (int j = 0; j < charCount.length; j++) {
//            if (charCount[j] > 0) {
//                System.out.println((char) j + ": " + charCount[j]);
//            }
//        }

//        int numFiles = 5; // liczba plików do utworzenia
//        Random rand = new Random();
//
//        for (int i = 1; i <= numFiles; i++) {
//            int[] numbers = new int[10];
//            for (int j = 0; j < numbers.length; j++) {
//                numbers[j] = rand.nextInt(10000);
//            }
//            Arrays.sort(numbers); // sortujemy rosnąco
//            FileWriter file = new FileWriter("data" + i + ".txt");
//            for (int num : numbers) {
//                file.write(num + " ");
//            }
//            file.close();
//        }

        File file = new File(
                "/Users/michallendzion/Documents/PJATK/ZADANIA/src/cwiczenia/c25/liczby.txt"
        );

        Scanner scanner = new Scanner(file);
        int sum = 0;

        while(scanner.hasNextInt()) {
            sum += scanner.nextInt();
        }
        System.out.println("Sum : " + sum);
        scanner.close();


    }
}

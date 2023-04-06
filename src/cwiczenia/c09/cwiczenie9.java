import java.util.Scanner;

public class cwiczenie9 {
    public static void main(String[] args) {
        
        //zadanie1();
        
        //zadanie2();
        
        //zadanie4();
        
        //zadanie5();
        
        //zadanie6();

        zadanie7();
        
            


    }

    public static void zadanie1() {
        for (int i = 75; i <= 150; i++)
            System.out.println((char)i + " - " + i);
    }

    public static void zadanie2() {
        for (int i = 1; i <= 10; i++) 
        {
            for (int j = 1; j <= 10; j++) 
            {
                System.out.print(i * j + " ");
            }
            System.out.println();
        }
    }

    public static void zadanie4() {
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Podaj liczbe: ");
        
        int num = scanner.nextInt();

        int digits = 0;

        int sum = 0;
        
        int temp = num;
        
        while (temp > 0)
        {
            digits += 1;
            temp /= 10;
        }

        temp = num;

        for (int i = 0; i < digits; i++)
        {
            sum += Math.pow(temp % 10, digits);
            temp /= 10;
        }

        if (sum == num)
            System.out.println("Liczba " + num + " jest narcystyczna.");
        else 
            System.out.println("Liczba " + num + " jest nienarcystyczna");
        
    }

    public static void zadanie5() {
        for (int i = 1; i <= 5; i++)
        {
            for (int j = 1; j <= i - 1; j++)
            {
                System.out.print(" ");
            }
            for (int k = 1; k <= 5 - i + 1; k++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i = 4; i >= 1; i--)
        {
            for (int j = 1; j <= i - 1; j++)
            {
                System.out.print(" ");
            }
            for (int k = i; k <= 5; k++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    
    public static void zadanie6() {
        int licznik = 0;
    
        for (int l = 2; l <= 30; l++)
        {
            for (int i = 1; i <= l; i++)
            {
                if (l % i == 0)
                {
                    licznik = licznik + 1;
                }
            }
                if (licznik <= 2)
                {
                    System.out.println(l);
                }
                licznik = 0;
        }
    }

    public static void zadanie7() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Podaj liczbe a: ");
        int a = scanner.nextInt();

        System.out.print("Podaj liczbe b: ");
        int b = scanner.nextInt();

        int random = (int)(Math.random() * 100);
        int count = 0;
        boolean rightGuess = false;

        while (!rightGuess)
        {
            if (random > a && random < b)
            {
                System.out.println("Wylosowana liczba " + random + " jest w przedziale.");
                count += 1;
                rightGuess = true;
            }
            else
            {
                System.out.println("Wylosowana liczba " + random + " jest poza przedziałem.");
                random = (int)(Math.random() * 100);
                count += 1;
            }
            System.out.println("Liczba prób: " + count + "\n");
        }
        
        
        
    }

    
                    

                

            

        

    
}
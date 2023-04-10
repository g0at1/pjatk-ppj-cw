import java.util.Scanner;

public class cwiczenie8 {
    public static void main(String[] args) {
        //zadanie1();
        
        //zadanie3();
        
        //zadanie4();
        
        //zadanie5();
        
        //zadanie6();

        //zadanie7();

        zadanie8();

        //zadanie9();
        
    
    }

    public static void zadanie1() {

        Scanner scanner = new Scanner(System.in);
        
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        double x1 = 0;
        double x2 = 0;

        double delta = b * b - 4 * a * c;
        double p = Math.sqrt(delta);
        
        if (delta < 0)
            System.out.println("Nie ma rozwiazan");
        else if (delta > 0)
        {
            x1 = ((-b - p) / (2 * a));
            x2 = ((-b + p) / (2 * a));
            System.out.println(x1);
            System.out.println(x2);
        }
        else 
        {
            x1 = (-b / (2 * a));
            System.out.println(x1);
        }

    }

    public static void zadanie3() {
        for (int i = 1; i <= 10; i++)
            System.out.println(i);
        
        int x = 1;
        while (x <= 10)
            System.out.println(x++);

        int y = 1;
        do {
            System.out.println(y++);
        } while (y <= 10);

    }

    public static void zadanie4() {
        int wrt = 10;
        int x = 1;
        for (int i = 1; i <= wrt; i++)
            System.out.println(i * wrt);

        do {
            System.out.println(x * wrt);
            x++;
        } while (x <= wrt);

        while (x <= wrt)
        {
            System.out.println(x * wrt);
            x++;
        }
        
    }

    public static void zadanie5() {
        boolean state = false;
        while (state)
        {
            System.out.println("while"); //while sie nie wypisze poniewaz state = false
        }

        do {
            System.out.println("do-while"); //do-while wypisze sie pomimo ze state = false
        } while (state);
    }

    public static void zadanie6() {
        Scanner scanner = new Scanner(System.in);

        /*int a = 0;
        
        while ((a = scanner.nextInt()) != 0) 
        {
            

        }
        */
        System.out.println("Wpisz numer: ");
        
		int number = scanner.nextInt();
		
        System.out.println("Wpisany numer: " + number);
		
        int sum = number;
		
        System.out.println("Suma: " + sum);
		
        while (number != 0){
			System.out.println("Wpisz numer: ");
			number = scanner.nextInt();
			System.out.println("Wpisany numer: " + number);
			sum = sum + number;
			System.out.println("Suma: " + sum);
		}
    }

    public static void zadanie7() {
        double wynik;
		for (int n = 0; n < 10; n++){
			wynik = 1 / Math.pow(2, n);
			System.out.println(wynik);
		}
    }

    public static void zadanie8() {
        int day = 1;
		int month = 11;
		int numberOfDays = 0;
		for (int i = 0; i < month - 2; i++){
			numberOfDays = numberOfDays + 30;
		}
		numberOfDays = numberOfDays + 1 - 2 + 1 + 1 + 1 + 1 + day;
		System.out.println(numberOfDays + " dni upłynęło");
    }

    public static void zadanie9() {
        
        for (int i = 0; i <= 2; i++)
        {
            for (int j = 0; j <= 5; j++)
                System.out.print("* ");
            System.out.println();
            
            for (int j = 0; j <= 4; j++)
                System.out.print(" *");
            System.out.println();
        }
    }
}
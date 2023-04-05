import java.util.Scanner;

public class cwiczenie14 {
    public static void main(String[] args) {
        float[][] tab1 = new float[8][8];
        
        for (int i = 0; i < tab1.length; i++)
            for (int j = 0; j <tab1[i].length; j++)
                tab1[i][j] = (float)(Math.random() * 10);
            

        for (float[] row: tab1)
        {
            for (float num: row)
            {
                System.out.print(num+" ");
            }
            System.out.println();
        }
        diagonalSums(tab1);
         
    }

    public static void randomArray() {
        Scanner scanner = new Scanner(System.in);


        int throw1 = (int)(Math.random() * 6) + 1;
        int throw2 = (int)(Math.random() * 6) + 1;

        String command;

        boolean quit = false;

        while (!quit)
        {
            System.out.print("Enter command: ");
            command = scanner.nextLine().toLowerCase();

            if (command.equals("r"))
            {
                throw1 = (int)(Math.random() * 6) + 1;
                throw2 = (int)(Math.random() * 6) + 1;
            }
            else if (command.equals("s"))
            {
                int tmp[][] = {{throw1}, {throw2}};
                for (int i = 0; i < tmp.length; i++)
                    for (int j = 0; j < tmp[i].length; j++)
                        System.out.print(tmp[i][j] + " ");
                System.out.println();
            }
            else if (command.equals("q"))
                quit = true;
            else
                System.out.println("Wrong command");
        }
    }

    public static void diagonalSums(float[][] arr) {
		int first = 0, second = 0;
		for (int i = 0; i < arr.length; i++) 
		{
			for (int j = 0; j < arr.length; j++) 
			{
				if (i == j)
					first += arr[i][j];
				if ((i + j) == (arr.length - 1))
					second += arr[i][j];
			}
		}
		System.out.println("Pierwsza przekątna:" + first);							
		System.out.println("Druga przekątna:" + second);
	}
}

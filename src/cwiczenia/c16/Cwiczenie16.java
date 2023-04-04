package cwiczenia.c16;

public class Cwiczenie16 {
    public static void main(String[] args) {
        splitToDigits(12511244);
        
        System.out.println(isArmstrongNumber(153));


        int[][] a = {{1, 2}, {3, 4}};
        int[][] b = {{1, 2}, {3, 4}};
        int[][] c = {{1, 2, 3}, {4, 5, 6}};

        System.out.println(
                jestRowna(a, b)
        );
        System.out.println(
                jestRowna(a, c)
        );
    }

    

    
    public static void splitToDigits(int num){
        
        String number = Integer.toString(num); 
        char[] dig = number.toCharArray();  

        for (int i = 0; i < dig.length; i++) 
            System.out.print(dig[i] + " ");
    }

    public static boolean isArmstrongNumber(int num) {
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
            return true;
        
        return false;
    }


    public static boolean jestRowna(int[][] a, int[][] b) {
        if (a.length != b.length) {
            return false;
        }
        for (int i = 0; i < a.length; i++) {
            if (a[i].length != b[i].length) {
                return false;
            }
            for (int j = 0; j < a[i].length; j++) {
                if (a[i][j] != b[i][j]) {
                    return false;
                }
            }
        }
        return true;
    }

    
}

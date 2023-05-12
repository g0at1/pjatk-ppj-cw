package wyklad.w06;

public
    class Main {

    final static int EMPTY_ELEMENT = -1;

    public static void main(String[] args) {
        {
            double[] arr = new double[3];

            arr[0] = 3.14;
            arr[1] = 5.28;
            arr[2] = 0;

            System.out.print("[");
            for (double val : arr)
                System.out.print(val + ", ");
            System.out.println("]");
        }
        {
            int[] arr = new int[20];
            int fill = 0;
            for(int i=0; i<10; i++)
                arr[fill++] = (int) (Math.random() * 10);

            for(int i=0; i<10; i++)
                arr[fill++] = (int) (Math.random() * 10);

            System.out.print("[");
            for (int val : arr)
                System.out.print(val + ", ");
            System.out.println("]");

            int lookingFor = 0;

            for(int i=0; i<fill; i++)
                if(arr[i] == lookingFor)
                    System.out.println("found@"+i);

            // usun element @ index 10

            for(int i = 10; i < fill-1; i++){
                arr[i] = arr[i+1];
            }
            fill--;
            arr[fill] = EMPTY_ELEMENT;
            System.out.print("[");
            for (int val : arr)
                System.out.print(val + ", ");
            System.out.println("]");

            // wstawienie wartosci na index 10

            System.out.println("fill: "+fill);
            if(arr.length >= fill+1){

                for(int i = fill; i > 10; i--)
                    arr[i] = arr[i-1];

                arr[10] = 5;
                fill++;

                System.out.print("[");
                for (int val : arr)
                    System.out.print(val + ", ");
                System.out.println("]");

            } else
                System.out.println("nie ma miejsca");

            {
                int tmp = arr[0];
                arr[0] = arr[10];
                arr[10] = tmp;
            }

            System.out.print("[");
            for (int val : arr)
                System.out.print(val + ", ");
            System.out.println("]");


            // znajdz najmniejszy element
            if(fill > 0){
                int tmpMinIndex = 0;
                for(int j = 0+1; j < fill; j++)
                    if(arr[tmpMinIndex] > arr[j])
                        tmpMinIndex = j;

                System.out.println("tmpMin: "+arr[tmpMinIndex] +"@"+tmpMinIndex);

                {
                    int tmp = arr[0];
                    arr[0] = arr[tmpMinIndex];
                    arr[tmpMinIndex] = tmp;
                }

                System.out.print("[");
                for (int val : arr)
                    System.out.print(val + ", ");
                System.out.println("]");
            }

            // sort
            if(fill > 0){
                for(int i=0; i<fill-1; i++) {
                    int tmpMinIndex = i;
                    for (int j = i + 1; j < fill; j++)
                        if (arr[tmpMinIndex] > arr[j])
                            tmpMinIndex = j;

                    {
                        int tmp = arr[i];
                        arr[i] = arr[tmpMinIndex];
                        arr[tmpMinIndex] = tmp;
                    }
                }

                System.out.print("[");
                for (int val : arr)
                    System.out.print(val + ", ");
                System.out.println("]");
            }
        }
        {
            int[] tab = new int[10];

            for(int i=0; i<tab.length; i++)
                tab[i] = (int) (Math.random() * 10);

            System.out.print(tab+"\t[");
            for (int val : tab)
                System.out.print(val + ", ");
            System.out.println("]");
            // usun element z indeksu 5
            {
                int[] tmpTab = new int[tab.length - 1];
                for (int i = 0; i < 5; i++)
                    tmpTab[i] = tab[i];
                for (int i = 5 + 1; i < tab.length; i++)
                    tmpTab[i - 1] = tab[i];
                tab = tmpTab;
            }
            System.out.print(tab+"\t[");
            for (int val : tab)
                System.out.print(val + ", ");
            System.out.println("]");
        }

        {
            int[] []tab;
            int wrt = 0;
            int[] arr;
        }

        {
            int[][] arr2d = new int[10][10];
            for(int i=0; i < arr2d.length; i++)
                for (int j=0; j < arr2d[i].length; j++)
                    arr2d[i][j] = (int)(Math.random()*10);

            System.out.println("[");
            for(int[] tab : arr2d) {
                for (int val : tab)
                    System.out.print(val + ", ");
                System.out.println();
            }
            System.out.println("]");
        }

        {
            int[][] arr2d = new int[10][];
            for(int i=0; i<arr2d.length; i++)
                arr2d[i] = new int[(int)(Math.random()*10)];

            System.out.println("[");
            for(int[] tab : arr2d) {
                for (int val : tab)
                    System.out.print(val + ", ");
                System.out.println();
            }
            System.out.println("]");
        }
    }
}

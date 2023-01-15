package w09;

public class Main {
    public static void main(String[] args) {
        int[] tab = {34, 5, 22, 8, 18};

        System.out.println("Zadanie 1:");
        bubbleSortRe(tab, tab.length);
        for (int val : tab)
            System.out.print(val + " ");
        System.out.println();


        Person person = new Person();
        person.name = "Jan";
        person.surname = "Kowalski";
        person.birthyear = 1998;


        System.out.println("Zadanie 3:");
        Fruit fruit = new Fruit("banana");
        fruit.show();

        Balloon balloon = new Balloon();


    }

    public static void bubbleSortRe(int[] arr, int n){
        int temp;

        if (n == 1)
            return;
        if (n == 0)
            return;

        for (int i = 0; i < n - 1; i++)
        {
            for (int j = 0; j < n - i - 1; j++)
            {
                if (arr[j] > arr[j+1])
                {
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }

        bubbleSortRe(arr, n-1);
    }
}
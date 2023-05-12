package wyklad.w05;

public
    class Main {

    final static int EMPTY_TABLE_VALUE = -1;

    public static void main(String[] args) {
        int wrt1 = 5,
            wrt2 = 5;

        System.out.println(wrt1 == wrt2);

        String str1 = "Hello";
        {
            String str2 = "Hello";

            System.out.println(str1 == str2);
        }
        String str3 = new String("Hello");
        System.out.println(str1 == str3);


        //=======================================

        int[] arr = null;
        System.out.println("arr: "+arr);

        arr = new int[5];
        System.out.println("arr: "+arr);

        int[] tab = {10, 20, 30};
        System.out.println("tab: "+tab);

        System.out.println("arr.length: "+arr.length);
        System.out.println("tab.length: "+tab.length);

        for(int i=0; i<tab.length; i++)
            System.out.println("tab["+i+"]: "+tab[i]);
/*
        for(int i=0; i<10; i++) // err arr length!
            System.out.println("arr["+i+"]: "+arr[i]);
*/
        for(int i=0; i< arr.length; i++)
            arr[i] = (int)(Math.random()*2)+4;

        System.out.print("[");
        for(int value : arr)
            System.out.print(value+", ");
        System.out.println("]");

        System.out.print("[");
        for(int value : arr) {
            value = 10; // logic err - think twice
            System.out.print(value + ", ");
        }
        System.out.println("]");

        System.out.print("[");
        for(int value : arr)
            System.out.print(value+", ");
        System.out.println("]");

        // ===========================================
        int lookFor = 5;

        for(int i=0; i<arr.length; i++)
            if(arr[i] == lookFor)
                System.out.println("found");

/*
        int lookFor = 5;
        boolean found = false;

        for(int i=0; i<arr.length; i++)
            if(arr[i] == lookFor) {
                System.out.println("found");
                break;
            }
/*
        for(int i=0; i < arr.length && !(found = lookFor == arr[i]); i++)
            ;
        if(found)
            System.out.println(found);
*/

        // ===================================

        arr[3] = 0;

        System.out.print("[");
        for(int value : arr)
            System.out.print(value+", ");
        System.out.println("]");

        // =========

        int[] arr1 = new int[5];
        for(int i=0; i< arr1.length; i++)
            arr1[i] = EMPTY_TABLE_VALUE;

    }


}

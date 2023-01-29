package cwiczenia.c17;

public class Main {
    public static void main(String[] args) {
        int[] tab1 = {1, 5, 6};
        int[] tab2 = {8, 9, 1, 5, 6};
        int[] merged = merge(tab1, tab2);

        for (int val : merged) {
            System.out.print(val + " ");
        }
        System.out.println();

        int[] arr = {6, 5, 2, 1, 1, 1};
        System.out.println(numEven(arr, 2));


    }

    public static int[] merge(int[] arr1, int[] arr2) {
        int[] mergedArr = new int[arr1.length + arr2.length];
        int i = 0, j = 0, k = 0;

        while (i < arr1.length && j < arr2.length) {
            mergedArr[k++] = arr1[i++];
            mergedArr[k++] = arr2[j++];
        }

        while (i < arr1.length) {
            mergedArr[k++] = arr1[i++];
        }

        while (j < arr2.length) {
            mergedArr[k++] = arr2[j++];
        }

        return mergedArr;
    }

    public static int gcdI(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcdI(b, a % b);
    }

    public static int maxElem(int[] arr, int from) {
        if (from == arr.length - 1) {
            return arr[from];
        }
        int max = maxElem(arr, from + 1);
        if (max < arr[from]) {
            max = arr[from];
        }
        return max;
    }

    public static int numEven(int[] arr, int from) {
        if (from == arr.length) {
            return 0;
        }
        int count = 0;
        if (arr[from] % 2 == 0) {
            count++;
        }
        return count + numEven(arr, from + 1);
    }
}

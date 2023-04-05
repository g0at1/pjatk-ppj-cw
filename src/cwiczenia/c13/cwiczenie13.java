import java.util.*;

public class cwiczenie13 {
    public static void main(String[] args) {
        int[] arr1 = {1, 3, 5, 7, 9};
		int[] arr2 = {10, 8, 6, 4, 2};
        int[] arr3 = new int[arr1.length + arr2.length];

        combineArrays(arr1, arr2, arr3);

        System.out.print("[");
        for (int val : arr3)
            System.out.print(val + ", ");
        System.out.print("]");

        
    }

    public static void combineArrays(int[] arr1, int[] arr2, int[] arr3) {
        int i = 0;
        int j = 0;
        int k = 0;
        while (i < arr1.length)
            arr3[k++] = arr1[i++];

        while (j < arr2.length)
            arr3[k++] = arr2[j++];

        Arrays.sort(arr3);
    }    
}

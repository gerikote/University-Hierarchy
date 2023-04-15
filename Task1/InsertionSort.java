package homework.Task1;

import java.util.Arrays;

public class InsertionSort {

    public static void sort(int[] arr) {

        for (int i = 1; i < arr.length; i++) {
            int comparator2 = arr[i];
            int position1 = i - 1;

            while (position1 > 0 && arr[position1] > comparator2) {
                arr[position1 + 1] = arr[position1];
                position1--;
            }

            arr[position1 + 1] = comparator2;

        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 9, 5, 6, 7, 8, 4};
        System.out.println("Original array is :" + Arrays.toString(arr));

        sort(arr);

        System.out.println("Array after sorting is : " + Arrays.toString(arr));
    }
}

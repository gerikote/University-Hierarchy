package homework.Task1;

import java.util.Arrays;

public class SelectionSort {

    public static void selectionSort(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            //Find the minimum element in the remaining unsorted array
            int minIndex = i;

            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }

            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 5, 4, 9, 8, 2, 3, 7, 6};
        System.out.println("Original array is : " + Arrays.toString(arr));
        selectionSort(arr);
        System.out.println("Array after sorting is : " + Arrays.toString(arr));

    }
}

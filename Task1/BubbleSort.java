package homework.Task1;

public class BubbleSort {

    //after each iteration the first and the last element of the array is sorted
    public static void main(String[] args) {
        int[] array = {5, 3, 8, 4, 2};
        int temp;

        System.out.println("Original Array");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }


        for (int i = 0; i < array.length; i++) {
            for (int j = 1; j < (array.length - i); j++) {
                if (array[j - 1] > array[j])
                //we swap j with j-1 and not i
                {
                    temp = array[j - 1];
                    array[j - 1] = array[j];
                    array[j] = temp;
                }
            }
        }


        System.out.println("\n Sorted Array is : ");

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}

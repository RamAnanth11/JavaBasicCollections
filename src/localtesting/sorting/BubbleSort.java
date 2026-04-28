package localtesting.sorting;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int [] array = {5,3,4,1,2,7,6};
        bubbleSort(array);
        System.out.println(Arrays.toString(array));
    }

    public static void bubbleSort(int[] arr) {
        for(int i = 0; i < arr.length-1; i++) {
            for(int j = 0; j < arr.length-i-1; j++) {
                if(arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }

    }
}
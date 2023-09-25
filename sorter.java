import java.util.Arrays;
import java.util.Scanner;
import java.util.ArrayList;
import java.io.*;
public class sorter {
    public static void main(String[] args) {
        int array[] = {1, 2, 3, 4, 5};
        selectionSort(array);
        System.out.println(Arrays.toString(array));
        insertionsort(array);
        System.out.println(Arrays.toString(array));
    }
    public static int[] selectionSort ( int arr[]){
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {

            int min_idx = i;
            for (int j = i + 1; j < n; j++)
                if (arr[j] < arr[min_idx])
                    min_idx = j;

            int temp = arr[min_idx];
            arr[min_idx] = arr[i];
            arr[i] = temp;
        }
        return arr;
    }
    public static int[] insertionsort(int arr[]) {
        int n = arr.length;
        for (int i = 1; i < n; ++i) {
            int key = arr[i];
            int j = i - 1;


            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
        return arr;
    }
}

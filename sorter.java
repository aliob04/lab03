import java.util.Arrays;
import java.util.Scanner;
import java.util.ArrayList;
import java.io.*;
public class sorter {
    public static void main(String[] args) {
        int array[] = {1, 2, 3, 4, 5};
        sort(array);
        System.out.println(Arrays.toString(array));
    }
    public static int[] sort ( int arr[]){
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
}
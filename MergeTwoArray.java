package array;

import java.util.Arrays;
import java.util.Scanner;

public class MergeTwoArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length : ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter element : ");
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter the length : ");
        int n1 = sc.nextInt();
        int arr1[] = new int[n1];
        for (int i = 0; i < arr1.length; i++) {
            System.out.print("Enter element : ");
            arr1[i] = sc.nextInt();
        }
        int resultarray[] = new int[arr.length + arr1.length];
        int k = 0;
        for (int i = 0; i < arr.length; i++){
            resultarray[k] = arr[i];
            k++;
        }
        for (int i = 0; i < arr1.length; i++){
            resultarray[k] = arr1[i];
            k++;
        }
        Arrays.sort(resultarray);
        for (int i = 0; i < resultarray.length; i++){
            System.out.println(resultarray[i]);
        }
    }
}

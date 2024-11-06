package array;

import java.util.Scanner;

public class ZeroToRight {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length : ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter element : ");
            arr[i] = sc.nextInt();
        }
        int resultarray[] = new int[arr.length];
        int k = 0;
        for (int i = 0 ; i < arr.length; i++){
            if (arr[i] != 0)
                resultarray[k++] = arr[i];
        }
        for (int i = 0; i < resultarray.length; i++){
            System.out.println(resultarray[i]);
        }
    }
}

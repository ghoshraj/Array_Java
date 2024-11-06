package array;

import java.util.Scanner;

public class ReverseAnArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length : ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter element : ");
            arr[i] = sc.nextInt();
        }
        for (int i = arr.length - 1; i >= 0; i--){
            System.out.println(arr[i]);
        }
    }
}

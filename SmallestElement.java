package array;

import java.util.Scanner;

public class SmallestElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length : ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter element : ");
            arr[i] = sc.nextInt();
        }
        int ele = arr[0];
        for (int i = 1; i < arr.length; i++){
            if (arr[i] < ele)
                ele = arr[i];
        }
        System.out.println("smallest element in the array is : " + ele);
    }
}

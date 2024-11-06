package array;

import java.util.Scanner;

public class FindTheMissingNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length : ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter element : ");
            arr[i] = sc.nextInt();
        }
        int count = arr[0];
        for (int i = 1; i < arr.length; i++){
            count++;
            while (arr[i] != count) {
                System.out.println(count);
                count++;
            }
        }
    }
}

package array;

import java.util.Scanner;

public class PairWith_A_GivenSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length : ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter element : ");
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter the sum : ");
        int sum = sc.nextInt();

        for (int i = 0; i < arr.length; i++){
            int target = sum - arr[i];
            for (int j = i + 1; j < arr.length; j++){
                if (target == arr[j]){
                    System.out.println(arr[i]);
                    System.out.println(arr[j]);
                    break;
                }
            }
        }
    }
}

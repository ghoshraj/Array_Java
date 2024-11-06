package array;

import java.util.Scanner;

public class MaxSubArraySum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length : ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter element : ");
            arr[i] = sc.nextInt();
        }
        int maxsum = Integer.MIN_VALUE;
        int curr;
        for (int i = 0; i < arr.length; i++){
            for (int j = i; j < arr.length;j++){
                curr = 0;
                for (int k = i; k <= j; k++){
                    curr += arr[k];
                }
                if (maxsum < curr)
                    maxsum = curr;
            }
        }
        System.out.println(maxsum);
    }
}

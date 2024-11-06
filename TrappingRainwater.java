package array;

import java.util.Scanner;

public class TrappingRainwater {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length : ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter element : ");
            arr[i] = sc.nextInt();
        }
        int leftmax[] = new int[arr.length];
        leftmax[0] = arr[0];
        for (int i = 1; i < arr.length; i++){
            leftmax[i] = Math.max(arr[i],leftmax[i - 1]);
        }
        int rightmax[] = new int[arr.length];
        rightmax[arr.length - 1] = arr[arr.length - 1];
        for (int i = arr.length - 2; i >= 0; i--){
            rightmax[i] = Math.max(arr[i] , rightmax[i + 1]);
        }
        int fans = 0;
        for (int i = 0 ; i < arr.length; i++){
            int ans = Math.min(leftmax[i],rightmax[i]);
            fans += ans - arr[i];
        }
        System.out.println(fans);
    }
}

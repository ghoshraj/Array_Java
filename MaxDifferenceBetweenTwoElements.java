package array;


import java.util.Scanner;

public class MaxDifferenceBetweenTwoElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length : ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter element : ");
            arr[i] = sc.nextInt();
        }
        int maxdifference = 0;
        for (int i = 1; i < arr.length; i++){
            int ans = arr[i] - arr[i - 1];
            if (ans > maxdifference)
                maxdifference = ans;
        }
        System.out.println(maxdifference);
    }
}

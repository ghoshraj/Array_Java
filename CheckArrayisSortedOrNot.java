package array;

import java.util.Scanner;

public class CheckArrayisSortedOrNot {
    public static boolean isSorted(int arr[]){

        boolean asending = true;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]){
                asending = false;
                break;
            }
        }
        if (!asending){
            boolean decending = true;
            for (int i = 0; i < arr.length - 1; i++){
                if (arr[i] < arr[i + 1]){
                    decending = false;
                    break;
                }
            }
            return decending;
        }
        return asending;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length : ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter element : ");
            arr[i] = sc.nextInt();
        }
        if (isSorted(arr))
            System.out.println("Your array is sorted");
        else
            System.out.println("Your array is not sorted");
    }
}

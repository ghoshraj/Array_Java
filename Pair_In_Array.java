package array;

import java.util.Scanner;

public class Pair_In_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length : ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter element : ");
            arr[i] = sc.nextInt();
        }
        for (int i = 0 ; i < arr.length; i++){
            for (int j = i + 1; j < arr.length; j++){
                if (arr[i] != arr[j])
                    System.out.print("( " + arr[i] + " , " + arr[j] + " )");
            }
            System.out.println();
        }
    }
}

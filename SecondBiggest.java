package array;

import java.util.Scanner;

public class SecondBiggest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length : ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter element : ");
            arr[i] = sc.nextInt();
        }
        int first = arr[0];
        int second = arr[0];
        for (int i = 1; i < arr.length; i++){
            if (arr[i] > first){
                second = first;
                first = arr[i];
            }
            else if (arr[i] > second || first == second){
                second = arr[i];
            }
        }
        System.out.println(second);
    }
}

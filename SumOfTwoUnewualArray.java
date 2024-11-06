package array;

import java.util.Scanner;

public class SumOfTwoUnewualArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length : ");
        int n = sc.nextInt();
        int arr1[] = new int[n];
        for (int i = 0; i < arr1.length; i++) {
            System.out.print("Enter element : ");
            arr1[i] = sc.nextInt();
        }
        System.out.print("Enter the length : ");
        int n1 = sc.nextInt();
        int arr2[] = new int[n1];
        for (int i = 0; i < arr2.length; i++) {
            System.out.print("Enter element : ");
            arr2[i] = sc.nextInt();
        }
        int resultarray[] = new int[Math.max(arr1.length,arr2.length)];
        for (int i = 0; i < resultarray.length; i++){
            int num1 = 0;
            int num2 = 0;
            if (i < arr1.length)
                num1 = arr1[i];
            if (i < arr2.length)
                num2 = arr2[i];
            int result = num1 + num2;
            resultarray[i] = result;
            System.out.println(resultarray[i]);
        }
    }
}

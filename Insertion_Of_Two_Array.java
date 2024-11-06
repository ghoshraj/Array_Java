package array;

import java.util.Scanner;

public class Insertion_Of_Two_Array {
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
        int resultarray[] = new int[Math.min(arr1.length , arr2.length)];
        int k = 0;
        for (int i = 0; i < arr1.length; i++){
            boolean flag = false;
            for(int j = 0; j < arr2.length; j++){
                if (arr1[i] == arr2[j]){
                    flag = true;
                    break;
                }
            }
            if (flag)
                resultarray[k++] = arr1[i];
        }
        for (int i = 0; i < k; i++){
            System.out.println(resultarray[i]);
        }
    }
}

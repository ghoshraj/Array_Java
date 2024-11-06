package array;

import java.util.Scanner;

public class FindDuplicate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length : ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter element : ");
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < arr.length; i++){
            boolean isduplicate = false;
            for (int j = i + 1; j < arr.length; j++){
                if (arr[i] == arr[j]){
                    isduplicate = true;
                    break;
                }
            }
            if (isduplicate)
                System.out.println(arr[i]);
        }
    }
}

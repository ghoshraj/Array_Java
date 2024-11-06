package array;

import java.util.Scanner;

public class LeadershipElement {
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
            boolean flag = true;
            for (int j = i + 1; j < arr.length; j++){
                if (arr[i] < arr[j]){
                    flag = false;
                }
            }
            if (flag)
                System.out.println(arr[i]);
        }
    }
}

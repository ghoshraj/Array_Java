package array;

import java.util.Scanner;

public class RemoveDuplicate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length : ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter element : ");
            arr[i] = sc.nextInt();
        }
        int array2[] = new int[arr.length];
        int c = 0;
        for (int i = 0 ; i < arr.length; i++){
            boolean flag = false;
            for (int j = i + 1 ; j < arr.length; j++){
                if (arr[i] == arr[j]){
                    flag = true;
                    break;
                }
            }
            if (!flag){
                array2[c++] = arr[i];
            }
        }
        int resularray[] = new int[c];
        for (int i = 0; i < c; i++){
            resularray[i] = array2[i];
            System.out.println(resularray[i]);
        }
    }
}

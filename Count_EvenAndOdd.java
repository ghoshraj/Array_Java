package array;

import java.util.Scanner;

public class Count_EvenAndOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length : ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter element : ");
            arr[i] = sc.nextInt();
        }
        int even_array = 0;
        int odd_array = 0;
        for (int i = 0; i < arr.length; i++){
            if (arr[i] % 2 != 0)
                odd_array++;
            else
                even_array++;
        }
        System.out.println(even_array + " " + odd_array);
    }
}

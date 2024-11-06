package array;

import java.util.Arrays;
import java.util.Scanner;

public class ConsecutiveSequence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length : ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter element : ");
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        int currentstreak = 1;
        int longeststreak = 1;
        int current = arr[0];
        int longer = arr[0];
        for (int i = 1; i < arr.length; i++){
            if (arr[i] == arr[i - 1] + 1)
                currentstreak++;
            else if (arr[i] != arr[i - 1]){
                if (currentstreak > longeststreak){
                    longeststreak = currentstreak;
                    longer = current;
                }
                current = arr[i];
                currentstreak = 1;
            }
        }

        if (currentstreak > longeststreak){
            longeststreak = currentstreak;
            longer = current;
        }
        for (int i = 0; i < longeststreak; i++){
            System.out.println(longer + i);
        }
    }
}

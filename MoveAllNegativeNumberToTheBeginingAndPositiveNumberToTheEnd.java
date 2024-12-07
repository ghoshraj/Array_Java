package array;

public class MoveAllNegativeNumberToTheBeginingAndPositiveNumberToTheEnd {
    public static void main(String[] args) {
        int arr[] = {10,20,-30 ,-2 ,8 ,9 ,-7};
        int index = 0;
        for (int i = 0; i < arr.length; i++){
            if (arr[i] < 0){
                int temp = arr[i];
                arr[i] = arr[index];
                arr[index] = temp;
                index++;
            }
        }
        for (int i = 0; i< arr.length; i++){
            System.out.println(arr[i]);
        }
    }
}

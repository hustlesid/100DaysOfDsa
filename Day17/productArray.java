package Day17;

import java.util.Arrays;

public class productArray {
    public static int producer(int arr[],int n , int left, int i){
        if(n==i){
            return 1;
        }
        int current = arr[i];

        int right = producer(arr, n, left*arr[i], i+1);

        arr[i] =left*right;

        return current*right;
    }
    public static void main(String[] args) {
        int[] A = { 5, 3, 4, 2, 6, 8 };
 
        producer(A, A.length, 1, 0);
 
        // print the modified array
        System.out.println(Arrays.toString(A));
    }
}

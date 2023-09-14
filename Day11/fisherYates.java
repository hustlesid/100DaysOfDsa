package Day11;

import java.util.Arrays;
import java.util.Random;

public class fisherYates {
    public static void swap(int A[],int i,int j){
         A[i] =A[i]^A[j];
         A[j] =A[i]^A[j];
         A[i] =A[i]^A[j];
    }
    public static void shuffler(int A[]){
        for(int i =A.length-1;i>=1;i--){
            Random random = new Random();
            int j = random.nextInt(i);
            swap(A, i, j);
        }
    }
    public static void main(String[] args) {
        int array[] ={1,2,3,4,5,6};
        shuffler(array);
        System.out.println(Arrays.toString(array));
    }
}

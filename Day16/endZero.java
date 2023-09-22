package Day16;

import java.util.Arrays;

public class endZero {

    public static void swapper(int array[],int i , int j){
        // array[i]= array[i]^array[j];
        // array[j]= array[i]^array[j];
        // array[i]= array[i]^array[j];
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    public static void sequencer(int array[]){
        int j =0;
        for (int i=0;i<array.length;i++){
            if(array[i]!=0){
                swapper(array, i, j);
                j++;
            }
        }
    }
    public static void main(String[] args) {
        int[] A = { 6, 0, 8, 2, 3, 0, 4, 0, 1 };
 
        sequencer(A);
        System.out.println(Arrays.toString(A));
    }
}

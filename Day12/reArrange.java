package Day12;

import java.util.Arrays;

public class reArrange {

    public static void swap(int array[],int i ,int j){
        array[i]= array[i]^array[j];
        array[j]= array[i]^array[j];
        array[i]= array[i]^array[j];
    }
    
    public static void reaaranger(int array[]){
        for(int i=1;i<array.length;i=i+2){
            if(array[i-1]>array[i]){
                swap(array, i-1, i);
            }

            if(i+1<array.length && array[i+1]>array[i]){
                swap(array, i+1, i);
            }
        }
    }
    public static void main(String[] args) {
        int [] arr = {9,6,8,3,7};
        reaaranger(arr);
        System.out.println(Arrays.toString(arr));
    }
}

package Day9;

import java.util.Arrays;

public class mergeSort {
    public static void merger(int array1[],int array2[]){
        int m = array1.length;
        int n = array2.length;
        
        for(int i=0;i<m;i++){
            if(array1[i]>array2[0]){
                array1[i]=array1[i]^array2[0];
                array2[0]=array1[i]^array2[0];
                array1[i]=array1[i]^array2[0];

                int first = array2[0];

                int k;
                for(k=1;k<n && array2[k]<first;k++){
                    array2[k-1] = array2[k];
                }
                array2[k-1] = first;
            }
        }
    }
    public static void main(String[] args) {
        int x[] ={1,4,7,8,10};
        int y[]= {2,3,9};

        merger(x, y);
        System.out.println("X: "+ Arrays.toString(x));
        System.out.println("Y "+ Arrays.toString(y));
    }
}

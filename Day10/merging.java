package Day10;

import java.util.Arrays;

public class merging {
    public static void merger(int X[],int Y[]){
        int n = 0;
        for(int i=0;i<X.length;i++){
            if(X[i]==0){
            X[i]=Y[n];
            n++;
            }
        }Arrays.sort(X);
    }
    public static void main(String[] args) {
        int arr1[] = {0,2,0,3,0,5,6,0,0};
        int arr2[] ={1,8,9,10,15};
        merger(arr1, arr2);
        System.out.println(Arrays.toString(arr1));
    }
}

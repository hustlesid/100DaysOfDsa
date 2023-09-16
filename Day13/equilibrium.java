package Day13;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class equilibrium {
    public static void equilibriumIndex(int array[]){
        int total = IntStream.of(array).sum();
        //int total = 0;
        // for(int i =0;i<array.length;i++){
        //     total = array[i]+total;
        //}
        int left = 0;
        List<Integer> indices = new ArrayList<>();

        for(int i = 0;i<array.length;i++){
            if(left ==total -(array[i]+left)){
                indices.add(i);
            }left +=array[i];
        }
        System.out.println("Eqiulibrium Index found at "+ indices );
        
    
    }
    public static void main(String[] args) {
        int arr[] = {0,-3,5,-4,-2,3,1,0};
        equilibriumIndex(arr);
        
    }
    
}

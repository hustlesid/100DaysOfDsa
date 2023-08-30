

import java.util.Arrays;

class solution{
    public static void sumfinder(int array[],int target){
        Arrays.sort(array);
        int low = 0;
        int high = array.length-1;
        while(low<high){
            if((array[low] +  array[high])==target){
                System.out.print("pair found "+ array[low] +" "+ array[high]);
                return;
            }
            if((array[low] +  array[high])<target){
                low++;
            }
            else{
                high--;
            }
        }System.out.println("Pair not found");
    }
    public static void main(String[] args) {
        int number[]={8,7,2,5,3,1};
        int target = 10;
        sumfinder(number, target);
    }
}

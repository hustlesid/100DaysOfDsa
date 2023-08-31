import java.util.HashSet;
import java.util.Set;

public class zeroSumSubArray {
    public static Boolean zerosumsubarr(int array[]){
        Set<Integer> set = new HashSet<>();
        set.add(0);
        int sum = 0;
        for(int i=0;i<array.length;i++){
            sum = sum +i;
            if(set.contains(sum)){
                return true;
            }set.add(sum);

        }return false;
    }
    public static void main(String[] args) {
        int number[]= {4,-6,3,-1,4,2,7};
        if(zerosumsubarr(number)){
            System.out.println("Subarray Exists");
        }else{
            System.out.println("Does not Exist");
        }
    }
}

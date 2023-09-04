import java.util.HashMap;
import java.util.Map;

class solution {

    public static void maxLengthSubarrFinder(int nums[], int sum){
        Map<Integer,Integer>map = new HashMap<>();
        map.put(0, 1);
        int target = 0;
        int len =0;
        int ending = -1;
        for (int i=0;i<nums.length;i++){
            target = target + nums[i];
            map.putIfAbsent(target, i);
            if(map.containsKey(target-sum) && len<i-map.get(target - sum)){
                len = i-map.get(target-sum);
                ending =i;
            }
        }System.out.println(" [ "+(ending-len+1)+" , "+ ending+ " ] ");

    }
    public static void main(String[] args) {
        int nums[]={5,6,-5,5,3,5,3,-2,0};
        int target = 8;
        maxLengthSubarrFinder(nums, target);
    }
    
}

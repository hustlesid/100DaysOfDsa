package Day15;

import Day12.reArrange;

public class longestSubArray {

    public static boolean consecutive(int arr[],int i,int j,int min,int max){
        if(max-min != j-i){
            return false;
        }
        boolean visited[] = new boolean[j-i+1];
        for(int k=i;k<=j;k++){
            if(visited[arr[k]-min]){
                return false;
            }
            visited[arr[k]-min]=true;
        }return true;
    }
    public static void findMaxSubarray(int[] A)
    {
        int len = 1;
        int start = 0, end = 0;
 
        // consider each subarray formed by `A[i…j]`
 
        // `i` denotes the beginning of the subarray
        for (int i = 0; i < A.length - 1; i++)
        {
            // stores the minimum and maximum element in subarray `A[i…j]`
            int min_val = A[i], max_val = A[i];
 
            // `j` denotes the end of the subarray
            for (int j = i + 1; j < A.length; j++)
            {
                // update the minimum and maximum elements of the subarray
                min_val = Math.min(min_val, A[j]);
                max_val = Math.max(max_val, A[j]);
 
                // check if `A[i…j]` is formed by consecutive integers
                if (consecutive(A, i, j, min_val, max_val))
                {
                    if (len < max_val - min_val + 1)
                    {
                        len = max_val - min_val + 1;
                        start = i;
                        end = j;
                    }
                }
            }
        }
 
        // print the maximum length subarray
        System.out.println("The largest subarray is [" + start + ", " + end + "]");
    }
 
    public static void main(String[] args) {
        int[] A = { 2, 0, 2, 1, 4, 3, 1, 0 };
 
        findMaxSubarray(A);
    }
}

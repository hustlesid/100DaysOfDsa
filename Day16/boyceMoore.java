package Day16;

public class boyceMoore {

    public static int majority(int arr[]){
        int counter=0; 
        int major =0;
        for(int i = 0;i<arr.length;i++){
            if(counter == 0){
                major = arr[i];
                counter =1;
            }

            else if(major == arr[i]){
                counter++;
            }
            else{
                counter--;
            }
        }
        return major;
    }
    public static void main(String[] args) {
        int[] nums = { 1, 8, 7, 4, 1, 2, 2, 2, 2, 2, 2 };
 
        System.out.println("The majority element is " + majority(nums));
    }
}

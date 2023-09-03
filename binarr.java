import java.util.Arrays;

public class binarr {
    public static void sorter(int array[]){
        int zero = 0;
        int ones =0;
        for (int i=0;i<array.length;i++){
            if(array[i]==0){
                zero++;
            }else{
                ones++;
            }

        }for(int i= 0;i<zero;i++){
            array[i]=0;
        }
        for(int i= zero;i<array.length;i++){
            array[i]=1;
        }
    }public static void main(String[] args) {
        int [] ar ={0,0,1,0,1,1,0,1,0,0};
        sorter(ar);
        System.out.println(Arrays.toString(ar));
    }
}

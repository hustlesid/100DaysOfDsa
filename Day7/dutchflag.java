package Day7;

import java.util.Arrays;

public class dutchflag {
    public static void classifier(int array[]){
        int counter0 = 0;
        int counter1 = 0;
        int counter2 = 0;
        int i =0;
        for(i = 0;i<array.length;i++){
            if(array[i]==0){
                counter0++;
            }else if(array[i]==1){
                counter1++;
            }else{
                counter2++;
            }
            
    
        }
        for(i=0;i<counter0;i++){
                array[i]=0;
            }for(i= counter0;i<array.length;i++){
                array[i]=1;
            }for(i = counter1+counter0;i<array.length;i++){
                array[i]= 2;
            }
    }
    public static void main(String[] args) {
        int num[]={0,1,2,2,1,0,0,2,0,1,1,0};
        classifier(num);
        System.out.println(Arrays.toString(num));
    }
}

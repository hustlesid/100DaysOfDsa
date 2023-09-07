package Day7.Day8;

public class maxProd {

    public static void maxProductFinder(int array[]){
        int biggest =array[0];
        int secBiggest = Integer.MIN_VALUE;
        int minimum = array[0];
        int secMinimum = Integer.MAX_VALUE;

        for(int i=1;i<array.length;i++){
            if(array[i]>biggest){
                secBiggest= biggest;
                biggest = array[i];
            }else if(array[i]>secBiggest){
                secBiggest = array[i];
            }
            if(array[i]<minimum){
                secMinimum=minimum;
                minimum = array[i];
            }else if(array[i]<secMinimum){
                secMinimum= array[i];
            }
        }

        if((secBiggest*biggest)>(secMinimum*minimum)){
            System.out.println("Pair is ("+ biggest + ","+secBiggest+")");
        }else{
            System.out.println("Pair is ("+ minimum + ","+secMinimum+")");
        }
    }
    public static void main(String[] args) {
        int arr[]={-10,-3,5,6,-2};
        maxProductFinder(arr);
    }
}

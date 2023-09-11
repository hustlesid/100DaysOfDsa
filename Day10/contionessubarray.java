package Day10;

public class contionessubarray {
    public static int zeroindexfounder(int A[]){
        int maxcount = 0;
        int maxindex = -1;
        int previousindex = -1;
        int counter = 0;
        for(int i = 0;i<A.length;i++){
            if(A[i]==1){
                counter++;
            }else{
                counter = i -previousindex;
                previousindex=i;
            }if(counter>maxcount){
                maxcount = counter;
                maxindex = previousindex;
            }
        }return maxindex;
    }
    public static void main(String[] args) {
        int array[]={0,0,1,0,1,1,1,0,1,1};
        int index = zeroindexfounder(array);
        if(index !=-1){
            System.out.println("Index to be replaced is "+index);
        }
        else{
            System.out.println("Invalid input");
        }
    }
}

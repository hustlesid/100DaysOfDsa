 class kadaneAlgo {
    public static int kadane(int array[]){
        
        int maxsum=0;
        int currentsum=0;

        for(int i=0;i<array.length;i++){
            currentsum= currentsum+array[i];

            if(currentsum>maxsum){
                maxsum=currentsum;
            }if(currentsum<0){
                currentsum = 0;
            }
        } return maxsum;
        
        
    
     // 
    }
    public static void main(String[] args) {
        int array[]={5,-4,-2,6,-1};
        System.out.println(kadane(array));
    }
}

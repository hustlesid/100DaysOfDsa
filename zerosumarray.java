 class zerosumarray {

    public static void zerosumprinter(int array[]){
        //int sum = 0;
        for(int i =0;i<array.length;i++){
            int sum =0;
            for(int j=i;j<array.length;j++){
                sum +=array[j];
                if(sum==0){
                    System.out.println("Subarray[" + i + "..."+ j +"]");
                }
            }
        }
    }
    public static void main(String[] args) {
        int num[]= {3,4,-7,3,1,3,3,1,-4,-2,-2};
        zerosumprinter(num);
    }
}

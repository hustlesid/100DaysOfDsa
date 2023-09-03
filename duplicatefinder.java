import java.util.stream.IntStream;
// integers of array must have a common difference of 1 else it won't work.
class answer {
    public static int duplicatefinder(int array[]){
        int realsum = IntStream.of(array).sum();
        int expectedsum = array.length*(array.length-1)/2;
        return (realsum - expectedsum);
        
    }public static void main(String[] args) {
        int number[]={1,2,3,4,4};
        System.out.println("Duplicate element is "+ duplicatefinder(number));
    } 
}

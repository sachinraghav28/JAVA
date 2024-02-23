public class LargestNumberjava{
    public static int largestNumber(int[] numbers){
        int largest=Integer.MAX_VALUE;
     

        for(int i=0;i<numbers.length;i++){
            if(largest<numbers[i]){
               largest=numbers[i];
            }
        }
    return largest;
}
    public static void main(String[] args) {
        int numbers[]={1,2,3,4,7,9};
        System.out.println(largestNumber(numbers));
    }
    
}

public class LinearSearch {
    public static int linear(int arry[],int key){
        for(int i=0;i<arry.length;i++){
            if(arry[i]==key){
              return i;
            }

        }
        return  -1;



    }
    public static void main(String[] args) {
        int arry[]={2,3,4,5,6,7};
        int key=6;

        int index=linear(arry,key);
        if(index==-1){
            System.out.println("not found ");
                }
            else{
                

            
        System.out.println("key is index"+index);
            }
        
        
    }
    
}

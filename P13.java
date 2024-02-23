public class P13 {
    public static void main(String[] args) {
        
        int n=5;
        int nst=1;
        int nsp=0;
        int row=2*n-1;

        for(int i=1;i<=row;i++){

            for(int j=1;j<=nst;j++){
                System.out.print("*");
            }
            System.out.println();
            //preparation for the next row
            if(i<=row/2){
                nst++;
            }else{
                nst--;
            } 
        }
    }
}

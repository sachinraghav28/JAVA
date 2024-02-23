public class QuestionNo11Pattern {
    public static void main(String[] args) {
        int n=5;
        int nst=1;
        int nsp=n-1;
        int row=n;

        for(int i=1;i<=row;i++){
            for(int j=1;j<=nsp;j++){
                System.out.print(" ");
            }
            for(int k=1;k<=nst;k++){
                 
                if(k%2==0){
                    System.out.print("!");
                }
                else{
                    System.out.print("*");
                }
            }
            System.out.println();
            nsp--;
            nst+=2;
        }
    }
    
}

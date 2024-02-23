public class Squre{
    public static void main(String[] args) {
        int n=5;
        int nsp=n-1;
        int nst=5;
        for(int i=1; i<=n;i++){
            for(int j=1;j<=nsp;j++){
                System.out.println(" ");

            }
            for(int k=1;k<=nst;k++){
            System.out.println("*");
            }
            System.out.println();
            nsp--;
            nst++;
        }
        
    }
}
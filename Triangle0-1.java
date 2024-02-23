public class Triangle0-1 {
    public static void Triangle0-1(int n) {
        for(int i=1;i<=5;i++){
            for(int j=1;j<=i;j++){
                if(i+j%2=0){System.out.println("1")
                }
                else{
                    System.out.println("0")
                }
                System.out.println()

            }
        }
    }
    public static void main(String[] args) {
        Triangle0-1(5);
        
    }
    
}

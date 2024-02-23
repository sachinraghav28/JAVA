public class P19 {
    public static void main(String[] args) {
        int n = 7;
        int nst = n / 2;
        int nsp = 1;
        int row = n; 

        for (int i = 1; i <= row; i++) {
            // star
            if(i==1||i==n){
                for(int j=1;j<=n;j++){
                    System.out.print("*");
                }
                System.out.println();
            }else{
            for (int j = 1; j <= nst; j++) {
                System.out.print("*");
            }
            // space
            for (int k = 1; k <= nsp; k++) {
                System.out.print(" ");
            }
            // star
            for (int j = 1; j <= nst; j++) {
                System.out.print("*");
            }

            System.out.println();

            if (i <= row / 2) {
                nsp += 2;
                nst--;
            } else {
                nsp -= 2;
                nst++;
            }
        }
    }

    }
}

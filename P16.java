public class P16 {
    public static void main(String[] args) {

        int n = 10;
        int nst = n;
        int nsp = n-1;
        int row = 2 * n - 1;

        for (int i = 1; i <= row; i++) {
            // for space
            for (int k = 1; k <= nsp; k++) {
                System.out.print(" ");
            }
            // for star
            for (int j = 1; j <= nst; j++) {
                System.out.print("*");
            }
            System.out.println();
            // preparation for the next row
            if (i <= row / 2) {
                nst--;
                nsp--;
            } else {
                nsp++;
                nst++;
            }
        }
    }
}

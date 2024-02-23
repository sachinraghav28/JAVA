/**
 * P18
 */
public class P18 {

    public static void main(String[] args) {
        int n = 7;
        int nst = 1;
        int nsp = n / 2;
        int row = n;
        for (int i = 1; i <= row; i++) {

            for (int j = 1; j <= nsp; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= nst; k++) {
                System.out.print("*");
            }
            System.out.println();
            if (i <= row / 2) {
                nst += 2;
                nsp--;
            } else {
                nsp++;
                nst -= 2;
            }
        }
    }
}
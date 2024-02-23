class PatternTriang{
    public static void main(String[] args) {
        int n=5;
        int nst=9;;
        int nsp=n+1;
        int row =n;
        for(int i=1;i<=row;i++){
            for(int j=1;j<=nsp;j++){
                System.out.print(" ");
            }
            for(int k=1;k<=nst;k++){
                System.out.print("*");
            }
            System.out.println();
            nsp++;
            nst-=2;
        }
    }

}
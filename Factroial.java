public class Factroial {
    public static int Fac(int a){
        int f=1;
        for(int i=1;i<=a;i++){
            f=f*i;
            

        }
        return f;

    }
    public static void main(String[] args) {
        int a=4;
        
        System.out.println(Fac(a));
        

    }
    
}

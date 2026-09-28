public class natsum{
    public static int natSum(int n){
        if(n == 1){
            return 1;
        }
        int sumnm1 = natSum(n-1);
        int sumn = n + sumnm1;
        return sumn;
    }
    public static void main(String args[]){
       System.out.print(natSum(10));
    }
}
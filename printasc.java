public class printasc{
    public static void printasc(int n){
        if(n == 10){
            System.out.print(n);
            return;
        }
        System.out.print(n + " ");
        printasc(n+1);
    }
    public static void main(String args[]){
        int n = 1;
        printasc(n);
    }
}
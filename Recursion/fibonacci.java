public class fibonacci {
    public static void main(String[] args) {
        System.out.println(fibo(5));
    }

    public static int fibo(int n){
        if(n==0) return 0;
        if(n==1) return 1;
        int prev= fibo(n-1);
        int pkp = fibo(n-2);
        return (prev+pkp);
    }
}

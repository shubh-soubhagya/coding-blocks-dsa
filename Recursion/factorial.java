public class factorial {
    public static void main(String[] args) {
        System.out.println(fact(0));
    }
    public static int fact(int n){
        if (n==1 || n==0) return 1;
        int smaller = fact(n-1);
        return n*smaller;
    }
}

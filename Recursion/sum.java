public class sum {
    public static void main(String[] args) {
        System.out.println(sumnum(5));
    }
    public static int sumnum(int n){
        if(n==0){return 0;}
        int pre = sumnum(n-1);
        return (n+pre);
    }
}

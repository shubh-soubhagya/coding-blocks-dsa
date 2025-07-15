public class generate_paranthesis {
    public static void main(String[] args) {
        int n =4;
        int total = generate("",0,0,n);
        System.out.println("Total: "+total);
    }
    public static int generate(String ans, int o, int c, int n){
        if(o==n && c==n){
            System.out.println(ans);
            return 1;
        }
        int open =0, close =0;
        if(o<n){
            open = generate(ans+"(", o+1, c, n);
        }
        if(o>c){
            close = generate(ans+")", o, c+1, n);
        }
        return open+close;
    }
}
public class generate_paranthesis {
    public static void main(String[] args) {
        int n =3;
        generate("",0,0,n);
    }
    public static void generate(String ans, int o, int c, int n){
        if(o==n && c==n){
            System.out.println(ans);
            return;
        }
        if(o<n){
            generate(ans+"(", o+1, c, n);
        }
        if(o>c){
            generate(ans+")", o, c+1, n);
        }
    }
}

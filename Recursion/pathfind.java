public class pathfind {
    public static void main(String[] args) {
        int n =3;
        int m =3;
        int cc =0;
        int cr=0;
        int dc = m-1;
        int dr = n-1;
        path("",cc,cr,dc,dr);
    }

    public static void path(String ans, int cc, int cr, int dc, int dr){
        if(cc==dc && cr==dr){System.out.println(ans); return;}
        if(cc>dc || cr>dr) return;
        //Horizontal
        path(ans+"H", cc+1, cr,dc,dr);
        //Vertical
        path(ans+"V", cc, cr+1, dc, dr);

    }
}

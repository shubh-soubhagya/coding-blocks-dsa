public class headtail {
    public static void main(String[] args) {
        Toss("",3);
    }
    public static void Toss(String ans, int n){
        if(n==0){System.out.println(ans); return;}
        Toss(ans+"H",n-1);
        Toss(ans+"T",n-1);
    }
}

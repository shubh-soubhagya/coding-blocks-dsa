public class pathfindcount {
    public static void main(String[] args) {
        int n = 3;
        int m = 3;
        int cc = 0;
        int cr = 0;
        int dc = m - 1;
        int dr = n - 1;
        int total = path("", cc, cr, dc, dr);
        System.out.println("Count: " + total);
    }

    public static int path(String ans, int cc, int cr, int dc, int dr) {
        if (cc == dc && cr == dr) {
            System.out.println(ans);
            return 1;
        }
        if (cc > dc || cr > dr) return 0;
        int h = path(ans + "H", cc + 1, cr, dc, dr);
        int v = path(ans + "V", cc, cr + 1, dc, dr);
        return h + v;
    }
}

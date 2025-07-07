public class finddetailsfromURL {
    public static void main(String[] args) {
        String s = "hacks.codingblocks.com/app/contests/8283/43";
        String parts[] = s.split("/");
        System.out.println("Website: "+ parts[0]);
        System.out.println("Contest ID: "+parts[3]);
        System.out.println("Problem ID: "+parts[parts.length-1]);


        //trim

        String p = "              hacks.codingblocks.com/app/contests/8283/43    ";
        System.out.println(p);
        p=p.trim();
        System.out.println(p);

    }
}



public class goodstring {

    public static void main(String[] args) {
        String s = "aaaiwiiiiiiiiaa8698n49th86&%^$&^*ahfn";
        int vow = 0;
        int con = 0;
        for(int i =0; i<s.length(); i++){
            char m = s.charAt(i);
            if(m =='a' || m =='e' || m =='i' || m =='u' || m =='o' || m =='A' || m =='E' || m =='I' || m =='O' || m =='U'){
                vow++;
            } else con++;
        }

        if (vow>con) {System.out.println("Good string");}
        else {System.out.println("Bad string");}
    }
    
}

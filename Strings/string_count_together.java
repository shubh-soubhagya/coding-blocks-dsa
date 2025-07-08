public class string_count_together {
    public static void main(String[] args) {
        String s = "aaabbcdffgii";
        int i=0;
        while(i<s.length()){
            int j = i ;
            while(j<s.length() && s.charAt(i)==s.charAt(j)){
                j++;
            }
            System.out.print(s.charAt(i)+""+(j-i)+" ");
            i = j;
        }

    }
}

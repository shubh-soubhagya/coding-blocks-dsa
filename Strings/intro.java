public class intro {
    public static void main(String[] args) {
        // char ch = 'z';

        // System.out.println((int)ch);
        // System.out.println((char)97);

        // String s = "Soubhagya Srivastava";
        // for (int i = 0; i<s.length(); i++){
        //     if(s.charAt(i)=='a' || s.charAt(i)=='i' || s.charAt(i)=='e' || s.charAt(i)=='o' || s.charAt(i)=='u'){
        //         System.out.println(s.charAt(i));
        //     }
        // }

        String s = "shubh";
        System.out.println(s.charAt(2));
        System.out.println(s.contains("h"));
        System.out.println(s.substring(1, 4));

        String sentence = "Shubh is legend!";
        String words[]=sentence.split(" ");
        for(int i =0; i<words.length; i++){
            System.out.print(words[i]+" -> ");
        }
    }
}

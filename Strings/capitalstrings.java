public class capitalstrings {

    public static void main(String[] args) {
        String str = "aABchbHK";

        System.out.println("Capital letters in the string:");

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);  
            if (ch >= 65 && ch <= 90) {
                System.out.print(ch + " ");
            }
        }
    }
}

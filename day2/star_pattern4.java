

public class star_pattern4 {
    
    public static void main (String[] args){
        int i = 1;

        while (i <= 5) {
            // Add leading spaces
            int spaces = 5 - i;  // change based on total rows (5 here)
            int s = 0;
            while (s < spaces) {
                System.out.print("  ");  // double space for better alignment
                s++;
            }

            // Star pattern (odd number using 2*i - 1)
            int j = 0;
            int m = 2 * i - 1;
            while (j < m) {
                System.out.print("* ");
                j++;
            }

            System.out.println();  // go to next line
            i++;
        }

    }

}

package day2;
import java.util.*;

public class star_pattern {
    public static void main(String[] args) {
        // int i = 0;

        // while(i <= 4){
        //     int j = 0;
        //     while(j <= 4){
        //         System.out.print(" * ");
        //         j++;
        //     }
        //     System.out.println();
        //     i++;
        // }


        
        // Scanner sc = new Scanner(System.in);
        // int row = sc.nextInt();
        // int i=0;

        // while(i<row){
        //     int j=0;
        //     while(j<=i){
        //         System.out.print(" * ");
        //         j++;
        //     }
        //     System.out.println();
        //     i++;


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


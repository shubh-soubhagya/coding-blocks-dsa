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


        
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int i=0;

        while(i<row){
            int j=0;
            while(j<=i){
                System.out.print(" * ");
                j++;
            }
            System.out.println();
            i++;
        }
    }
}

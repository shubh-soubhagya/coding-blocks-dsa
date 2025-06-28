package day2;
import java.util.*;

public class star_pattern3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("State your number: ");
        int row = sc.nextInt();
        // System.out.println("State your number: " + row );
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

    


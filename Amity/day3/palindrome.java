package day3;

import java.util.Scanner;

public class palindrome {

    public static void main (String[] args){


        Scanner sc = new Scanner(System.in);
        System.out.print("Number: ");
        int num = sc.nextInt();
        int original = num;

        int rev =0;

        while(num>0){

            int ld = num%10;
            rev = rev*10 +ld;
            num = num/10;
        }

        // System.out.println(rev);

        if(original==rev)System.out.println("Palindrome");
        else System.out.println("Not palindrome");

    }
    
}

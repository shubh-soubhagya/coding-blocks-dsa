package day4;

import java.util.Scanner;

public class odd_even {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int oddsum = 0;
        int evensum =0;

        for(int i=1; i<=n; i++){
            int digit = n%10;

            if(digit%2==0){
                evensum = evensum + digit;
            }
            else{
                oddsum = oddsum + digit;
            }
            n = n/10;

        }

        if(evensum!=0 && evensum%4==0 || oddsum%3==0 && oddsum!=0){

            System.out.println("True");
        }
        else{
            System.out.println("False");
        }

    }
}

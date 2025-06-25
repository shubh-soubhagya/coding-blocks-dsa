package day2;

import java.util.Scanner;

public class sumdigits {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int sum =0;
        while(num!=0){
            int ld = num%10;
            sum = sum + ld;
            num = num/10;
        }

        System.out.println(sum);

    }
    
}

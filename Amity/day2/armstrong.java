package day2;

import java.util.Scanner;

public class armstrong {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        int original = num;  // preserve original value
        int cnt = 0;

        // Count number of digits
        int temp = num;
        while(temp != 0){
            temp = temp / 10;
            cnt++;
        }

        int sum = 0;
        temp = num;  // reuse temp to extract digits again

        while(temp != 0){
            int digit = temp % 10;
            sum = sum + (int)Math.pow(digit, cnt);
            temp = temp / 10;
        }

        if(sum == original){
            System.out.println("Armstrong");
        } else {
            System.out.println("Not Armstrong");
        }

        sc.close();  // good practice
    }
}

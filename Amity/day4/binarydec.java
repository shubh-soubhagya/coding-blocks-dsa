package day4;

import java.util.Scanner;

public class binarydec {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your number: ");
        int n = sc.nextInt(); // Binary number as integer input (e.g., 1011)

        int sum = 0;
        int power = 0;

        while(n > 0) {
            int digit = n % 10;
            sum += digit * Math.pow(2, power);
            power++;
            n = n / 10;
        }

        System.out.println("Decimal: " + sum);
        sc.close();
    }
}

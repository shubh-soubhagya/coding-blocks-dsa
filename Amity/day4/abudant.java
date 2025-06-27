package day4;

import java.util.Scanner;


public class abudant {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int divisor = 0;
        int sum =0;
        for(int i=1; i<n; i++){
            
            if(n%i==0){
                divisor=i;
                sum =  sum + divisor;
            }

        }
        System.out.println("Sum:" + sum);

        // if(sum>n)System.out.println("Abudant number!");
        // else if(sum==n)System.out.println("Neutral Number");
        // else System.out.println("Deficit number");

        System.out.println(n==sum?"Neutral":n>sum?"Deficet":"Abudant");
    }
}

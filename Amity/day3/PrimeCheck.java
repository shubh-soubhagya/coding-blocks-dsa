import java.util.Scanner;

public class PrimeCheck {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        int i = 1;
        int count = 0;

        while(i <= num){
            if(num % i == 0){
                count++;
            }
            i++;
        }

        if (count == 2){
            System.out.println("prime");
        } 
        else if(num==1){
            System.out.println("prime");
        }
         else {
            System.out.println("not prime!");
        }

        sc.close();
    }
}

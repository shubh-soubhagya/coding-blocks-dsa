
import java.util.*;

public class factors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        System.out.print("Enter number: ");      
        int num = sc.nextInt();                    
        int fact = 2;
        while(fact <= num){
            if(num % fact == 0){
                System.out.println(fact);
                num = num/fact;
                // num = quotient;

            }
            else {
                fact++;
            }
        }
    }
}

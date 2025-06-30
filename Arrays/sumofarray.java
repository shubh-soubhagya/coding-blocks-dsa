import java.util.Scanner;

public class sumofarray {
    public static void main(String[] args){


        int a[]= {1,2,3,5,4,5,478,5,1,4};

        int sum = 0;

        for(int i =0; i<a.length; i++){
            sum = sum + a[i];
        }

        System.out.println(sum);
    }
}

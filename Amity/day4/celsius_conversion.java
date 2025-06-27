package day4;

// import java.util.Scanner;

public class celsius_conversion {
    public static void main(String[] args){

        for(int i = 20; i<=100; i++){
            if(i%2==0){
                double farhenheit = ((9.0/5)*(i))+32;
                System.out.println(farhenheit);

            }
            
        }
    }
}

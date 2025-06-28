package day1;

public class even_loop {

    public static void main(String[] args){
        int i = 2;

        while(i<=100){System.out.println(i); i =i+1;}
        while(i<=100){System.out.println(i++);}

        while(i<=100){
            if(i%2==0){
                System.out.println(i);
            }
            i++;
        }
    }
    
}

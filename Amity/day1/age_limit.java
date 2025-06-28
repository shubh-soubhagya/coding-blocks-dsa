package day1;

public class age_limit {

    public static void main(String[] args){
        int age = 18/2;

        if(age<10){System.out.println("Cannot sit in front seat!");}
        else if (age>=10 && age<16){System.out.println("Can seat in front seat, but cannot drive!");}
        else if (age>=16 && age<18){System.out.println("Can opt for learning licesnce");}
        else {System.out.println("Can drive");}
    }
    
}

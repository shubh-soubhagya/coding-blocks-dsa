package day1;

public class visa_check {
    public static void main(String[] args){
        char visa = 'A';
        double amt = 51000;

        if(visa=='A'){
            if(amt>=100000){
                System.out.println("Ultra rich");
            }
            else if(amt<100000 && amt>=50000){
                System.out.println("rich");
            }
            else {
                System.out.println("avg");
            }
        }
        else{
            if(amt>=100000){
                System.out.println("Rich");
            }
            else if(amt<100000 && amt>=50000){
                System.out.println("middle class");
            }
            else {
                System.out.println("avg");
            }
        }
    }
}

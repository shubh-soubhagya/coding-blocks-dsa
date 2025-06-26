package day3;

public class hcf {

    public static void main(String[] args){

        int num1 = 40;
        int num2 = 60;
        int hcf = 1;

        for(int i =2; i<=Math.min(num1,num2); i++){

            if(num1%i==0 && num2%i==0){
                hcf = i;
            }
        }

        System.out.println(hcf);

        


    }
    
}

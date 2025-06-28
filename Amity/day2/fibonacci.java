package day2;

public class fibonacci {

    public static void main(String[] args){

        int ele = 2; //when we decrease the ele, the total number of output elements increases
        int f =0;
        int s = 1;
        System.out.print(f+" "+s+" ");

        while(ele<8){
            int sum = f+s;
            System.out.print(sum+" ");
            f=s;
            s =sum;
            ele++;
        }

    }
    
}

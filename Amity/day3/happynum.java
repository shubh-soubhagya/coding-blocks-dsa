package day3;

public class happynum {
    public static void main (String[] args){
        int num = 19;
        int temp=0;
        
        for(int i=0; i<=1000; i++){

            int sum =0;
            
            while (num>0){

                sum = sum + (num%10)*(num%10);
                num = num/10;
            } 

            if(sum==1){
                temp=1;
                break;
            }

            num = sum;
        }

        if(temp==1){System.out.println("happy");}
        else{System.out.println("Not happy");}
    }
}

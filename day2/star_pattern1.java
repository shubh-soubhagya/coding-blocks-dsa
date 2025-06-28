

public class star_pattern1 {
    public static void main(String[] args){

        int i = 4;

        while (i>=0){
            int j = 0;
            while(j<i+1){
                System.out.print("*");
                j++;
            }
            System.out.println();
            i--;
        }

        
    }
}


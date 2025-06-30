public class twosum {
    public static void main(String[] arg){

        int target = 9;
        int a[] = {3,5,1,7,8,9,5,4};
        int temp = 0;

        for(int i=0; i<a.length; i++){
            for(int j =i+1; j<a.length; j++){

                if(a[i]+a[j]==target){System.out.println(i+" "+ j); temp =1;}
                // break;
            }
            // if(temp==1) break;
        }
        if(temp==0){
            System.out.println("Not found!");
        }


    }
}

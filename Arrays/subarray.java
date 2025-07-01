public class subarray {
    public static void main(String[] args){
        int a[] = {5,-2,-4,6,1,2,-9};
        // int b[];
        int Maxsum = Integer.MIN_VALUE;
        for(int i =0; i<a.length; i++){
            int sum = 0;
            for(int j = i; j<a.length; j++){
                sum = sum + a[j];
                if(Maxsum<sum) Maxsum=sum;
            }
        }

        System.out.println(Maxsum);
    }
}

public class Kadens_algo {
    public static void main(String[] args) {
        int a[] ={1,4,5,2,45,7};
        int sum =0;
        int max = Integer.MIN_VALUE;
        for(int i=0; i<a.length;i++){
            sum = sum +a[i];
            if(sum>max) max = sum;
            if(sum<0) sum=0;
        }
        System.out.println(max);
    }
}

public class largest_smallest {
    public static void main(String[] args){

        int a[] = { 1, 50 ,2 ,4,1};
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for(int i=0; i<a.length; i++){
            if(a[i]>max){
                max = a[i];
            }
        }

        for(int i=0; i<a.length; i++){
            if(a[i]<min){
                min = a[i];
            }
        }

        System.out.println(max);
        System.out.println(min);
    }
}

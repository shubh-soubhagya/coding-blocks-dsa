public class swap_values {
    public static void main(String[] args){
        int a[] = {2,3,4,5,6,7};

        swap(a);

        // temp=a[1];
        // a[1] = a[4];
        // a[4] = temp;
        
        for(int i =0; i<a.length; i++){
            System.out.print(a[i]+" ");
        }
        
    }

    public static void swap(int a[]){
        int temp=a[1];
        a[1] = a[4];
        a[4] = temp;
    }
}

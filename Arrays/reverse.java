import java.util.Scanner;

public class reverse {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();

        int a[] = new int[size];
        for(int i=0; i<=size-1; i++){
            a[i] = sc.nextInt();
        }

        Reverse(a);

        for(int i=0; i<=size-1; i++){
            System.out.print(a[i]+" ");
        }


    }

    public static void Reverse(int a[]){
        int start = 0;
        int end = a.length-1;

        while(start<end){
            int temp = a[start];
            a[start] = a[end];
            a[end] = temp;
            start++;
            end--;
        }
    }
    
}

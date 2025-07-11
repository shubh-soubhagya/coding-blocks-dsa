import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int target = sc.nextInt();

        int a[] = new int[n];

        int ele = 2;
        int f=0;
        int s=1;
        // System.out.print(f+" "+s+" ");
        a[0]=f;
        a[1]=1;

        while(ele<n){
            int sum = f+s;
            a[ele] = sum;
            f=s;
            s = sum;
            ele++;

        }

        for(int i =0;i<n; i++){
            System.out.print(a[i]+" ");
        }

    }
}

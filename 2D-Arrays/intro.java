import java.util.Scanner;

public class intro {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        int m= sc.nextInt();
        int a[][] = new int[n][m];

        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                a[i][j] = sc.nextInt();
            }
        }
        print(a);
    }

    public static void print(int a[][]){

        int n = a.length;
        int m = a[0].length;

        for(int i=0; i<n;i++){
            for(int j = 0; j<m; j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
    }
}

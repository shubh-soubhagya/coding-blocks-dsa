import java.util.Scanner;

public class linear_search {
    public static void main(String[] args){
        int a[] = {1,5,8,6,4,7};

        boolean found = search(a,21);
        System.out.println(found);
    }

    public static boolean search(int a[], int num){
         for(int i=0; i<a.length; i++){
            if(a[i]==num) return true; 
        }
        return false;
    }
}

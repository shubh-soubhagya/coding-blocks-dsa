public class firstindex {
    public static void main(String[] args) {
        int a[]= {6,5,1,65,4,8,8,9,4,479,1,2,1,5,2,2};
        int target = 4;
        System.out.println(find(a,0,target));
    }

    public static int find(int a[], int i, int target){
        
        if(i>=a.length) return -1;
        if(a[i]==target) return i;
        int f = find(a,i+1, target);
        return f;

    }
}

public class binary_search {
    public static void main(String[] args) {
        int a[] ={2,6,9,11,44,88};

        int ans = BS(a,44);
        System.out.println(ans);

    }

    public static int BS(int a[], int target) {
        int i=0;
        int j = a.length-1;

        while(i<=j){
            int mid = (i+j)/2;
            if(a[mid]==target)return mid;
            else if(a[mid]>target) j= mid-1;
            else i=mid+1;
        }

        return -1;
        
    }
}

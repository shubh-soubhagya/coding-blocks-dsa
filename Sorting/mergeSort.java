public class mergeSort {
    public static void main(String[] args) {
        int a[] = {6,9,1,5,4,8,3,4,7};
        int a_sort[] = sort(0,a.length-1,a);
        for(int i =0; i<a_sort.length;i++){
            System.out.print(a_sort[i]+" ");
        }
    }

    public static int[] sort(int si, int ei, int arr[]){
        if(si==ei){
            int a[] = new int[1];
            a[0] = arr[si];
            return a;
        }

        int mid = (si+ei)/2;
        int fa[] = sort(si,mid,arr);
        int sa[] = sort(mid+1, ei, arr);

        int a[] = mergeSortedArrays(fa,sa);
        return a;
    }

    public static int[] mergeSortedArrays(int[] arr1, int[] arr2) {
        int n = arr1.length, m = arr2.length;
        int[] result = new int[n + m];

        int i = 0, j = 0, k = 0;

        while (i < n && j < m) {
            if (arr1[i] <= arr2[j]) {
                result[k++] = arr1[i++];
            } else {
                result[k++] = arr2[j++];
            }
        }

        while (i < n) result[k++] = arr1[i++];

        while (j < m) result[k++] = arr2[j++];

        return result;
    }
}

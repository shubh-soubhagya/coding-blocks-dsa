public class zigzagcolumn {
    public static void main(String[] args) {

        int a[][] = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        int n = a.length;
        int m = a[0].length;

        for(int i =0; i<m; i++){

            if(i%2==0){
                for(int j = 0; j<n; j++){
                    System.out.print(a[j][i]+"\t");
                }
                // System.out.println();

            } else if(i%2!=0) {
                for(int j=n-1; j>=0; j--){
                    System.out.print(a[j][i]+"\t");
                }
                // System.out.println();

            }
        }
        
    }
}

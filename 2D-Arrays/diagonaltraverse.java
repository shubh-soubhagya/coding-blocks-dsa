public class diagonaltraverse {

    public static void main(String[] args) {

        int a[][] = {
                    {1,2,3,4},
                    {5,6,7,8},
                    {9,10,11,12},
                    {13,14,15,16}
                };

        for(int row=0; row<a.length; row++){

            int r = row;
            int c = 0;
            while(r>=0 && c<a[0].length){
                System.out.print(a[r][c]+" ");
                r--;
                c++;
            }

        }

        for(int col=1; col<a[0].length;col++){
            int r = a.length-1;
            int c = col;
            while(c<a[0].length && r>=0){
                System.out.print(a[r][c]+" ");
                r--;
                c++;
            }
        }
        
        
    }
    
}

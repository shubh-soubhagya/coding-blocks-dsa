public class Number_of_island {
    public static void main(String[] args) {

        char[][] grid = {{'1','1','0','0','0'},
        {'1','1','0','0','0'},
        {'0','0','1','0','0'},
        {'0','0','0','1','1'}};

        int count = 0;
        for(int i=0; i<grid.length; i++){
            for(int j=0; j<grid[0].length; j++){
                if(grid[i][j]=='1'){
                    count++;
                    fill_onetozero(grid, i, j);
                }
            }
        }
        System.out.println(count);
    }

    public static void fill_onetozero(char grid[][], int row, int col){
        if(row<0 || row>=grid.length || col<0 || col>=grid[0].length || grid[row][col]=='0') return;
        grid[row][col]='0';
        fill_onetozero(grid, row-1, col); //up
        fill_onetozero(grid, row+1, col); //bottom
        fill_onetozero(grid, row, col-1); //left
        fill_onetozero(grid, row, col+1); //right
    }
}

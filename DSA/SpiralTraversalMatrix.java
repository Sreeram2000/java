/*
Given a matrix of size r*c. Traverse the matrix in spiral form.
Example 1:
Input:
r = 4, c = 4
matrix[][] = {{1, 2, 3, 4},
           {5, 6, 7, 8},
           {9, 10, 11, 12},
           {13, 14, 15,16}}
Output: 
1 2 3 4 8 12 16 15 14 13 9 5 6 7 11 10
*/


public class SpiralTraversalMatrix {
    /*
    Function to return a list of integers denoting spiral traversal of matrix.
    1>Initialize row,col as 0 and r_size and c_size are given.
    2>Traverse through first row => last column => last row => first column.
    3>Then increase row,col and decrease r_size and c_size moving into inner structure
    4>Note: Ensure that row<r and col<c and that the same values are not printed twice.
    */
    static ArrayList<Integer> spirallyTraverse(int matrix[][], int r, int c)
    {
        ArrayList<Integer> result = new ArrayList<Integer>();
        int row = 0;
        int col = 0;
        while(row<r && col<c)
        {
            for(int i=col;i<c;i++)
            {
                result.add(matrix[row][i]);
            }
            row++;
            
            for(int i=row;i<r;i++)
            {
                result.add(matrix[i][c-1]);
            }
            c--;
            
            if(row<r)
            {
                for(int i=c-1;i>=col;i--)
                {
                    result.add(matrix[r-1][i]);
                }
                r--;
            }
          
            if(col<c)
            {
                for(int i=r-1;i>=row;i--)
                {
                    result.add(matrix[i][col]);
                }
                col++;
            }
        }
        return result;
    }
}

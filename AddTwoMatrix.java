public class AddTwoMatrix {
    // add two matrices of size 2*3
    public static void main(String[] args) {
        int [][] mat1 = { {1,2,3}, {4,5,6}};
        int [][] mat2 = { {3,4,2}, {5,6,3}};
        int [][] result = {{0,0,0}, {0,0,0}};
        for(int i=0;i<mat1.length;i++){ // row number of times
            for(int j=0;j<mat1[i].length;j++){ // column number of time
                System.out.printf(" Setting value for i = %d and j = %d \n",i,j );
                result[i][j] = mat1[i][j] + mat2[i][j];
            }
        }
        for(int i=0;i<mat1.length;i++){ // row number of times
            for(int j=0;j<mat1[i].length;j++){ // column number of time
                result[i][j] = mat1[i][j] + mat2[i][j];
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }

    }
}

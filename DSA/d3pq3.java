package DSA;
// transpose of a matrix
public class d3pq3 {

    public static int[][] transposeMatrix(int matrix[][]) {
        int n = matrix.length;
        int m = matrix[0].length;
        int tmatrix[][] = new int[m][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                tmatrix[j][i] = matrix[i][j];
            }
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(tmatrix[i][j] + " ");
            }
            System.out.println();
        }
        return tmatrix;
    }

    public static void main(String[] args) {
        int matrix[][] = { { 11, 12, 13 },
                { 14, 15, 16 } };

        transposeMatrix(matrix);
    }
}

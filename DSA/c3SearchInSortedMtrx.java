public class C3SearchInSortedMtrx {
    public static boolean staircaseSearch(int matrix[][], int key){
        int i=0, j=matrix[0].length-1;
        while(i<matrix.length && j >=0){
            if(matrix[i][j] == key){
                System.out.println("Found key at (" + i + ","+ j + ")");
                return true;
            }else if(key < matrix[i][j]){
                j--;
            }else{
                i++;
            }
        }
        System.out.println("key not found.");
        return false;
    }
    public static void main(String[] args) {
        int matrix[][] = {{10, 20, 30, 40},
                         {15, 25, 35, 45},
                         {27, 29, 37, 48},
                         {32, 33, 39, 50}};
        int key = 33;
        staircaseSearch(matrix, key);
    }   
}
import java.util.Scanner;

public class TransposeMatrixMult {

    static final int LEN = 3;//length of array 

    public static void main(String[] args) {
        int[][] matrix = new int[LEN][LEN];
        System.out.println("Enter 9 integers by entering the Return key between each:");
        matrix = getMatrix(matrix); //use getMatrix method to get matrix
        System.out.println("Original Matrix:");
        printMatrix(matrix);
        int[][] trans_matrix = TransMatrix(matrix);//use TransMatrix method to get transposed matrix
        System.out.println("Transposed Matrix:");
        printMatrix(trans_matrix);
        System.out.println("Transposed Matrix * Original Matrix :");
        printMatrix(multiplication(trans_matrix, matrix));//use multiplicatoin method to get multiplication
    }

    /**
     * method get Matrix from user. user enter 9 integers and it saves
     * respectively.
     *
     * @param arr
     * @return
     */
    public static int[][] getMatrix(int[][] arr) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        return arr;
    }

    /**
     * method printing matrix by rows and columns
     *
     * @param arr
     */
    public static void printMatrix(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }
    }

    /**
     * method getting transposed matrix.
     *
     * @param arr
     * @return
     */
    public static int[][] TransMatrix(int[][] arr) {
        int[][] transarr = new int[3][3];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                transarr[i][j] = arr[j][i];
            }
        }
        return transarr;
    }

    /**
     * method returning mutliplication of two matrixes.
     *
     * @param first
     * @param second
     * @return
     */
    public static int[][] multiplication(int[][] first, int[][] second) {
        int[][] mult_matrix = new int[3][3];
        for (int i = 0; i < LEN; i++) {
            for (int j = 0; j < LEN; j++) {
                for (int k = 0; k < LEN; k++) {
                    mult_matrix[i][j] += first[i][k] * second[k][j];
                }
            }
        }
        return mult_matrix;
    }
}

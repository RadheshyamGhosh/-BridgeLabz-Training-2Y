import java.util.Random;

public class MatrixOperations {

    // Generate random matrix
    public static int[][] generateMatrix(int rows, int cols) {
        Random rand = new Random();
        int[][] matrix = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = rand.nextInt(10); // 0-9 random values
            }
        }
        return matrix;
    }

    // Add two matrices
    public static int[][] addMatrix(int[][] A, int[][] B) {
        int rows = A.length, cols = A[0].length;
        int[][] C = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                C[i][j] = A[i][j] + B[i][j];
            }
        }
        return C;
    }

    // Subtract two matrices
    public static int[][] subtractMatrix(int[][] A, int[][] B) {
        int rows = A.length, cols = A[0].length;
        int[][] C = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                C[i][j] = A[i][j] - B[i][j];
            }
        }
        return C;
    }

    // Multiply two matrices
    public static int[][] multiplyMatrix(int[][] A, int[][] B) {
        int rowsA = A.length, colsA = A[0].length;
        int rowsB = B.length, colsB = B[0].length;

        if (colsA != rowsB) throw new IllegalArgumentException("Matrix multiplication not possible!");

        int[][] C = new int[rowsA][colsB];
        for (int i = 0; i < rowsA; i++) {
            for (int j = 0; j < colsB; j++) {
                for (int k = 0; k < colsA; k++) {
                    C[i][j] += A[i][k] * B[k][j];
                }
            }
        }
        return C;
    }

    // Display matrix
    public static void displayMatrix(int[][] M) {
        for (int[] row : M) {
            for (int val : row) {
                System.out.printf("%4d", val);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[][] A = generateMatrix(2, 3);
        int[][] B = generateMatrix(2, 3);

        System.out.println("Matrix A:");
        displayMatrix(A);
        System.out.println("Matrix B:");
        displayMatrix(B);

        System.out.println("Addition:");
        displayMatrix(addMatrix(A, B));

        System.out.println("Subtraction:");
        displayMatrix(subtractMatrix(A, B));

        // For multiplication, B must have same rows as A's cols
        int[][] C = generateMatrix(3, 2);
        System.out.println("Matrix C (for multiplication):");
        displayMatrix(C);

        System.out.println("Multiplication A x C:");
        displayMatrix(multiplyMatrix(A, C));
}
}
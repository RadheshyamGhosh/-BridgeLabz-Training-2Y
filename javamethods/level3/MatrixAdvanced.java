import java.util.Random;

public class MatrixAdvanced {

    // Generate random matrix
    public static int[][] generateMatrix(int rows, int cols) {
        Random rand = new Random();
        int[][] matrix = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = rand.nextInt(10); // 0-9
            }
        }
        return matrix;
    }

    // Transpose
    public static int[][] transpose(int[][] M) {
        int rows = M.length, cols = M[0].length;
        int[][] T = new int[cols][rows];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                T[j][i] = M[i][j];
            }
        }
        return T;
    }

    // Determinant of 2x2
    public static int determinant2x2(int[][] M) {
        return M[0][0] * M[1][1] - M[0][1] * M[1][0];
    }

    // Determinant of 3x3
    public static int determinant3x3(int[][] M) {
        return M[0][0] * (M[1][1] * M[2][2] - M[1][2] * M[2][1])
             - M[0][1] * (M[1][0] * M[2][2] - M[1][2] * M[2][0])
             + M[0][2] * (M[1][0] * M[2][1] - M[1][1] * M[2][0]);
    }

    // Inverse of 2x2
    public static double[][] inverse2x2(int[][] M) {
        int det = determinant2x2(M);
        if (det == 0) throw new ArithmeticException("Matrix not invertible!");
        double[][] inv = new double[2][2];
        inv[0][0] = M[1][1] / (double)det;
        inv[0][1] = -M[0][1] / (double)det;
        inv[1][0] = -M[1][0] / (double)det;
        inv[1][1] = M[0][0] / (double)det;
        return inv;
    }

    // Inverse of 3x3
    public static double[][] inverse3x3(int[][] M) {
        int det = determinant3x3(M);
        if (det == 0) throw new ArithmeticException("Matrix not invertible!");
        double[][] inv = new double[3][3];

        // Cofactor expansion
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                int[][] minor = new int[2][2];
                int r = 0, c;
                for (int m = 0; m < 3; m++) {
                    if (m == i) continue;
                    c = 0;
                    for (int n = 0; n < 3; n++) {
                        if (n == j) continue;
                        minor[r][c] = M[m][n];
                        c++;
                    }
                    r++;
                }
                int minorDet = determinant2x2(minor);
                inv[j][i] = Math.pow(-1, i + j) * minorDet / (double) det; // transpose for adjoint
            }
        }
        return inv;
    }

    // Display int matrix
    public static void displayMatrix(int[][] M) {
        for (int[] row : M) {
            for (int val : row) {
                System.out.printf("%4d", val);
            }
            System.out.println();
        }
    }

    // Display double matrix
    public static void displayMatrix(double[][] M) {
        for (double[] row : M) {
            for (double val : row) {
                System.out.printf("%8.3f", val);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[][] M2 = generateMatrix(2, 2);
        int[][] M3 = generateMatrix(3, 3);

        System.out.println("Matrix 2x2:");
        displayMatrix(M2);
        System.out.println("Determinant (2x2): " + determinant2x2(M2));
        System.out.println("Inverse (2x2):");
        displayMatrix(inverse2x2(M2));

        System.out.println("\nMatrix 3x3:");
        displayMatrix(M3);
        System.out.println("Determinant (3x3): " + determinant3x3(M3));
        System.out.println("Inverse (3x3):");
        displayMatrix(inverse3x3(M3));

        System.out.println("\nTranspose of 3x3:");
        displayMatrix(transpose(M3));
}
}
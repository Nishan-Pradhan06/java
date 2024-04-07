import java.util.Scanner;

public class Matrix {
    public static void main(String[] args) {
        int i, j, k;
        int[][] a = new int[3][3];
        int[][] b = new int[3][4];
        int[][] result = new int[3][4];
        Scanner sc = new Scanner(System.in);

        // Taking input for matrix a
        System.out.println("Enter the 3 X 3 matrix:");
        for (i = 0; i < 3; i++) {
            for (j = 0; j < 3; j++) {
                a[i][j] = sc.nextInt();
            }
        }

        // Taking input for matrix b
        System.out.println("Enter the 3 X 4 matrix:");
        for (i = 0; i < 3; i++) {
            for (j = 0; j < 4; j++) {
                b[i][j] = sc.nextInt();
            }
        }

        // Computing the product of matrices a and b
        for (i = 0; i < 3; i++) {
            for (j = 0; j < 4; j++) {
                for (k = 0; k < 3; k++) {
                    result[i][j] += a[i][k] * b[k][j];
                }
            }
        }

        // Displaying the result matrix
        System.out.println("The product of matrices A and B is:");
        for (i = 0; i < 3; i++) {
            for (j = 0; j < 4; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }
}

//wap to print pyramid numbers pattern.
public class pattern {
    public static void main(String[] arg) {
        int rows = 5, i, j; // Number of rows
        for (i = 1; i <= rows; i++) {
            for (j = 1; j <= rows - i; j++) {
                System.out.print(" ");
            }
            for (j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
}

//write a program to find maximum between 3 numbers
public class maximum_num {
    public static void main(String[] arg) {
        int n = 2, n1 = 3, n3 = 4;
        int max_num = 0;
        if (n > n1) {
            max_num = n;
            System.out.print("Maximum number is: " + max_num);
        } else if (n1 > n) {
            max_num = n1;
            System.out.println("\n" + "Maximum number is: " + max_num);
        }
        else {
            max_num = n3;
            System.out.println("\n" + "Maximum number is: " + max_num);
        }
    }
}
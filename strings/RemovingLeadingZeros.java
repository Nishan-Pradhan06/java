import java.util.Scanner;

public class RemovingLeadingZeros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number string: ");
        String strOriginal = sc.nextLine();
        RemovingLeadingZeros.zeroRemoval(strOriginal);
    }

    public static void zeroRemoval(String strOriginal) {
        int i;
        for (i = 0; i != strOriginal.length(); i++) {
            char ch = strOriginal.charAt(i);
            if (ch != '0') {
                break;
            }
        }
        String newStr = "";
        for (int j = i; j != strOriginal.length(); j++) {
            char p = strOriginal.charAt(j);
            newStr = newStr + p;
        }
        System.out.println("String without leading zeros is " + newStr);
    }
}

import java.util.Scanner;

public class GetInputFromUser {
    public static void main(String[] args) {
        // using scanner for Getting inout from user.
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println("You entered : " + s);

        int a = sc.nextInt();
        System.out.println("You entered : " + a);

        float b = sc.nextFloat();
        System.out.println("You entered : " + b);
    }
}

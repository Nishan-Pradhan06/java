//
import java.util.Scanner;

public class days {
    public static void main(String[] args) {
        String days[] = { "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday" };
        int choice;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your choice");
        choice = sc.nextInt();
        switch (choice) {
            case 1:
                System.out.println("You choose " + days[0]);
                break;

            case 2:
                System.out.println("You choose " + days[1]);
                break;

            case 3:
                System.out.println("You choose " + days[2]);
                break;

            case 4:
                System.out.println("You choose " + days[3]);
                break;

            case 5:
                System.out.println("You choose " + days[4]);
                break;

            case 6:
                System.out.println("You choose " + days[5]);
                break;

            case 7:
                System.out.println("You choose " + days[6]);
                break;

            default:
                System.out.println("......Invlaid Numbers.....");
                break;
        }
        sc.close();
    }
}

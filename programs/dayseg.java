import java.util.Scanner;

public class dayseg {
    public static void main(String[] args) {
        String days[] = { "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday" };
        int choice;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Choice: ");
        choice = sc.nextInt();
        switch (choice) {
            case 1:
                System.out.println("You Choose day:" + days[0]);
                break;
            case 2:
                System.out.println("You Choose day:" + days[1]);
            case 3:
                System.out.println("You Choose day:" + days[2]);
            case 4:
                System.out.println("You Choose day:" + days[3]);
            case 5:
                System.out.println("You Choose day:" + days[4]);
            case 6:
                System.out.println("You Choose day:" + days[5]);
            case 7:
                System.out.println("You Choose day:" + days[6]);
            default:
                break;
        }
        sc.close();
    }
}

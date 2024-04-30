import java.util.Scanner;

public class ages {
    public static void main(String[] args) {
        int user1, user2, user3;
        Scanner u1 = new Scanner(System.in);
        Scanner u2 = new Scanner(System.in);
        Scanner u3 = new Scanner(System.in);
        System.out.println("Enter First User Age: ");
        user1 = u1.nextInt();
        System.out.println("Enter Second User Age: ");
        user2 = u2.nextInt();
        System.out.println("Enter Third User Age: ");
        user3 = u3.nextInt();
        if (user1 >= user2 && user1 >= user3) {
            System.out.println("User one is Oldest with age of " + user1);
        } else if (user2 >= user1 && user2 >= user3) {
            System.out.println("User Two is Oldest with age of " + user2);
        } else {
            System.out.println("User Three is Oldest with age of " + user3);
        }
        u1.close();
        u2.close();
        u3.close();
    }
}

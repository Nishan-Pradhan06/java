import java.util.Scanner;

class Room {
    int length;
    int width;

    Room(int x, int y) // super class constructor
    {
        length = x;
        width = y;
    }

    int arera() {
        return (length * width);
    }

    public static void main(String[] args) {
        int l, b;
        Scanner length = new Scanner(System.in);
        Scanner breadth = new Scanner(System.in);
        System.out.println("Enter the Length of Area");
        l = length.nextInt();
        System.out.println("Enter the Breadth of Area");
        b = breadth.nextInt();
        Room r1 = new Room(l, b);
        System.out.println("Area of the room is " + r1.arera());
    }
}

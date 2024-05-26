
public class add {
    static int num;
    static int num2;
    static int num3;

    static void set(int n, int n2) {
        num = n;
        num2 = n2;

    }

    static void get() {
        num3 = num + num2;
        System.out.println("sum " + num3);
    }

    public static void main(String[] args) {
        add.set(10, 100);
        add.get();
    }
}

public class distance {
    static int initial_value;
    static int final_value;
    static int distances;

    static void set(int n1, int n2) {
        initial_value = n1;
        final_value = n2;
    }

    static void get() {
        distances = initial_value + final_value;
        System.out.println("The Distance: " + distances);
    }

    public static void main(String[] args) {
        distance.set(10, 100);
        distance.get();
    }
}

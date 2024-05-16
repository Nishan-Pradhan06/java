public class exp2 {
    public static void main(String[] args) {
        int[] myNumbers = { 1, 2, 3 };
        System.out.println(myNumbers[10]);
    }
}
// output --->Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 10 out of bounds for length 3
        // at exp2.main(exp2.java:4)
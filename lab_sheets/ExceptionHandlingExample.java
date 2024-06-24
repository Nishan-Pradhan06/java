public class ExceptionHandlingExample {

    public static void main(String[] args) {
        // Division by zero example
        try {
            int a = 10;
            int b = 0;
            int result = a / b; // This will throw ArithmeticException
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error: Cannot divide by zero.");
        } finally {
            System.out.println("Division operation completed.");
        }

        // Array index out of bounds example
        try {
            int[] array = { 1, 2, 3 };
            int index = 5;
            int value = array[index]; // This will throw ArrayIndexOutOfBoundsException
            System.out.println("Array value: " + value);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Array index out of bounds.");
        } finally {
            System.out.println("Array operation completed.");
        }
    }
}

public class boxing {
    public static void main(String[] args) {
        // Boxing: converting primitive to wrapper class object
        Integer i = Integer.valueOf(2); // Explicit boxing
        Double d = Double.valueOf(3.5); // Explicit boxing

        // Unboxing: getting primitive value from wrapper class object
        System.out.println(i.intValue()); // Explicit unboxing
        System.out.println(d.doubleValue()); // Explicit unboxing

        String ageStr = "16";

        // Parsing string to int and performing addition
        System.out.println("age" + ageStr + " in 10 years " + (Integer.parseInt(ageStr) + 10));

        // String concatenation
        System.out.println("note that + with strings does concatenation, not addition: " + (ageStr + 10));
    }
}

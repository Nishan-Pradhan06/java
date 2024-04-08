/**
 * super_eg
 */
class super_eg {
    // instance variable
    int a = 36;

    static float x = 12.2f;
}

// Subclass 'base' extending superclass 'super_eg'
class base extends super_eg {
    // Method in subclass
    void gfg() {
        // Referring to superclass instance variable 'a' using super keyword
        super.a = 1;
        System.out.println(a); // Output: 1

        // Referring to superclass static variable 'x' using super keyword
        super.x = 60.3f;
        System.out.println(x); // Output: 60.3
    }

    // Main method to test the subclass method
    public static void main(String[] args) {
        new base().gfg(); // Creating an object of subclass and calling its method
    }
}
    
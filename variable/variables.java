public class variables {
    static int a = 10;

    void fun() {
        int b = 10;
        System.out.println("a: " + "" + a + "\nb: " + b);
        ++a;
        ++b;
    }

    public static void main(String[] args) {
        variables referencesName = new variables();
        referencesName.fun();// 10 10 
        referencesName.fun();// 11 10
    }
}
 //static value create a single memory value so its memory is for life time so last value was called 11 that is why after recalling the method 11 was print instead of 10
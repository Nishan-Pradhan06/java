//Write Java String Program to Compare Two Strings
public class compareString {
    public static void main(String[] args) {
        String string1 = "java";
        String string2 = "java";
        String string3 = "java";

        compareString(string2, string3);
    }

    public static void compareString(String str1, String str2)
    {
        if (str1.equals(str2)) {
            System.out.println("The String are equals");
        }
        else {
            System.out.println("The Strings are not equal");
        }
    }
}

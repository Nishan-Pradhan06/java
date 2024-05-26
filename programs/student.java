public class student {
    static String std;
    static int rollno;

    static void set(String s, int r) // to take input from user
    {
        std = s;
        rollno = r;
    }

    static void get() {
        System.out.println("Student Name is " + std);
        System.out.println("Roll No is " + rollno);
    }

    public static void main(String[] args) {
        student.set("Jhon", 2);
        student.get();
    }
}

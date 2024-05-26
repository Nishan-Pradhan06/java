public class students {
    public static void main(String[] args) {
        int score = 75;
        students st = new students(); // Note: Class name should start with capital letter
        st.modifyStudent(score);
        System.out.println("The original student score: " + score);

    }

    // Define modifyStudent as an instance method
    void modifyStudent(int i) {
        i = i + 10;
        System.out.println("The modified student score: " + i);
    }
}

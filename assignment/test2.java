public class test2 {
    public static void main(String[] args) {
        Integer i = 2;
        Double d = 3.5;
        System.out.println(i.intValue());
        System.out.println(d.doubleValue());
        String ageStr = "16";
        System.out.println("age" + ageStr + " in 10 years " + (Integer.parseInt(ageStr) + 10));
        System.out.println("note that+with strings doesnit concatenation,not addition:"+(ageStr+10));
        
    }
}

class PrivateTest {
    private int myNumber = 10;
    public int getMynumber() {
        return myNumber;
    }
}

class SubPrivateTest extends PrivateTest {
    public void printSomething() {
        System.out.println("The value of Mynumber is" + this.myNumber);
        System.out.println("The value of return by method is" + this.getMynumber());
    }
}

public class TestPrivateTest {
    public static void main(String[] args) {
        SubPrivateTest spt = new SubPrivateTest();
        spt.printSomething();
    }
}

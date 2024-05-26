class Myclass {
    public int Mynumber = 10;

    public int getMynumber() {
        return Mynumber;
    }
}

public class instanceTest {
    public static void main(String[] args) {
        Myclass mc = new Myclass();
        System.out.println("The value of myNumber is " + mc.Mynumber);
        System.out.println("The Value returnred by thie method is " + mc.getMynumber());

    }
}

//new--> memory allocation garne value hold garna lai   
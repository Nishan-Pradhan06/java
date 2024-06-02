public class variable {
    static int staticVariable = 40; // static variable //its lifetime is untill the program ends
    int instanceVariable = 30; //instance variable
    public static void main(String[] args)
    {
        int localVariable = 10; //local variable
        variable instanceReference = new variable(); //class name----reference name------new keyword to create a new object


        System.out.println("Local varibale value: "+localVariable); //printing the value of local varibale
        System.out.println("Instance vaibale value: " + instanceReference.instanceVariable); //printing the value of instance varibale
        System.out.println("Static Variable : " +variable.staticVariable);
    }
}
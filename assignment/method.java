//qn-7

class Parent {
    void parentMethod() {
        System.out.println("This is parent class");
    }
}

class Child extends Parent {
    void childMethod() {

        System.out.println("This is child class");
    }
}

public class method {

    public static void main(String[] args) {
        // creating object of the Parent class
        Parent parentObj = new Parent();
        parentObj.parentMethod();
        // creating object of the Child class
        Child childObj = new Child();
        childObj.childMethod();
        // calling method of parent class usnig obj of child class..
        childObj.parentMethod();
    }
}
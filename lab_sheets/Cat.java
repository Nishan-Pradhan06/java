package animals;

public class Cat extends Animal 

public void makeSound() {
    System.out.println("Dog barks");
}

public static void main(String[] args) {
    Cat dog = new Cat();
    dog.makeSound();
}
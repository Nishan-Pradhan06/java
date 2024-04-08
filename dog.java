// 1. Write a Java program to create a class called "Dog" with a name and breed attribute. Create two instances of the "Dog" class, set their attributes using the constructor and modify the attributes using the setter methods and print the updated values.


public class dog {
    String name = "Charlie";
    String breed = "Labrador Retriever";

    // creating the constructor for name and breed
    public dog(String n, String b) {
        this.name = n;
        this.breed = b;
    }

    // using the setter method
    public void setDogName(String dog_name) {
        this.name = dog_name;
    }

    // setting the information with setter
    public void setDogBreed(String dog_breed) {
        this.breed = dog_breed;
    }

    // getting the information using getter methods
    public String getDogName() {
        return name;
    }

    public String getDogBreed() {
        return breed;
    }

    public static void main(String[] args) {

        dog dog1 = new dog("Buddy","Golden");
        dog dog2 = new dog("max","german");

        System.out.println("Before Changes");
        System.out.println("Dog 1 - Name: " + dog1.getDogName() +", Breed: " + dog1.getDogBreed());
        System.out.println("Dog 2 - Name: " + dog2.getDogName() +", Breed: " + dog2.getDogBreed());

        dog1.setDogName("Bailey");
        dog2.setDogBreed("Labrodor");

        System.out.println("After Changes");
        System.out.println("Dog 1 - Name: " + dog1.getDogName() +", Breed: " + dog1.getDogBreed());
        System.out.println("Dog 2 - Name: " + dog2.getDogName() +", Breed: " + dog2.getDogBreed());

    }
}

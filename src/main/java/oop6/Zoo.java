package oop6;

public class Zoo {

    public static void main(String[] args) {


        Animal[] animal = {
                new Cat("Kesha", "black"),
                new Cat("Kitty", "white"),
                new Dog("Tuzik", "gray")
        };
        for (Animal value : animal) {
            value.animalRun(20, 50);
        }


    }
}

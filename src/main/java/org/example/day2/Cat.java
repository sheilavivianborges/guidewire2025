package org.example.day2;

public class Cat extends Pet {
    public void purr() {
        System.out.println("purrrrr");
    }

    @Override
    public void makeSound() {
        System.out.println("meow");
    }
}

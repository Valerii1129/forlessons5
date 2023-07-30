package lesson18.alishevLesson34;

import java.util.ArrayList;
import java.util.List;

public class Start {
    public static void main(String[] args) {
        List<Animal> listOfAnimal = new ArrayList<>();
        listOfAnimal.add(new Animal(1));
        listOfAnimal.add(new Animal(2));

        List<Dog> listOfDog = new ArrayList<>();
        listOfAnimal.add(new Dog());
        listOfAnimal.add(new Dog());

        test(listOfAnimal);
        test(listOfDog);
    }

    private static void test(List<? extends Animal> list) {
        for (Animal a : list
        ) {
            System.out.println(a);
        }
    }
}



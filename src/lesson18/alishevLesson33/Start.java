package lesson18.alishevLesson33;

import java.util.ArrayList;
import java.util.List;

public class Start {
    public static void main(String[] args) {
        List animals = new ArrayList();

        Animal ourAnimal = new Animal();

        animals.add("cat");
        animals.add("dog");
        animals.add("frog");
        animals.add(ourAnimal);

        String animal = (String) animals.get(1);
        System.out.println(animal);

        ///////////////////////// C появлением дженериков /////////////////////////////////////
        List<String> animals2 = new ArrayList<>();
        animals2.add("cat");
        animals2.add("dog");
        animals2.add("frog");
        //animals2.add(ourAnimal);//ошибка копиляции

        String animal2 = animals2.get(1);
    }
}

class Animal {
}
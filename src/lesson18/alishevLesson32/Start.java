package lesson18.alishevLesson32;

public class Start {
    public static void main(String[] args) {
        /*Dog dog = new Dog();
        //Upcasting - Восдящее преобразование.
        Animal animal = dog;

        //Downcasting - Несходящще преобразование.
        Dog dog2 = (Dog) animal;
        dog2.bark();*/

        //Несходящее преобразование может быть не всегда безопасным
        Animal a = new Animal();
        Dog dog = (Dog) a;//ClassCastExeption
        dog.bark();
    }
}

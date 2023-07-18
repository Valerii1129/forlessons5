package lesson14;

public class AlishevLesson14 {
    public static void main(String[] args) {
        Person person1 = new Person();
        person1.name = "Roman";
        person1.age = 50;

        Person person2 = new Person();
        person2.name = "Vova";
        person2.age = 20;

        person1.speak();
        person1.sayHello();
        System.out.println();
        //person2.speak();
//        System.out.println("Меня зовут " + person1.name + ", мне " + person1.age + " лет");
//        System.out.println("Меня зовут " + person2.name + ", мне " + person2.age + " лет");
    }
}

class Person {
    //У класса могут быть:
    //1. Данные(поля)
    //2. Действияб которые он может совершать (мотоды)
    String name;
    int age;

    void speak() {
        for (int i = 0; i < 3; i++) {
            System.out.println("Меня зовут " + name + ", мне " + age + " лет");
        }

        }
        void sayHello () {
            System.out.println("Hello");
    }
}
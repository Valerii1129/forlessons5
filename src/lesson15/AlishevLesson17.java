package lesson15;

public class AlishevLesson17 {
    public static void main(String[] args) {
        Person17 person1 = new Person17();
        person1.setNameAndAge("Dima",22);

        Person17 person2 = new Person17();
        person2.setNameAndAge("Katya", 18);

        person1.speak();
        person2.speak();
    }
}

class Person17 {
    //У класса могут быть:
    //1. Данные(поля)
    //2. Действия, которые он может совершать (методы)
    String name;
    int age;

    void setNameAndAge(String name,int age) {
        this.name = name;
        this.age = age;
    }
    void speak() {
            System.out.println("Меня зовут " + name + ", мне " + age + " лет");
    }
}

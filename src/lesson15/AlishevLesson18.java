package lesson15;

public class AlishevLesson18 {
    public static void main(String[] args) {
        Person18 person1 = new Person18();
        person1.setAge(10);
        person1.setName("Dima");

        System.out.println("значение в методе main: " + person1.getName());
        System.out.println("значение в методе main: " + person1.getAge());

        person1.speak();
    }
}

class Person18 {
    //У класса могут быть:
    //1. Данные(поля)
    //2. Действия, которые он может совершать (методы)
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.isEmpty()) {
            System.out.println("ты ввел пустое имя.");
        } else {
            this.name = name;
        }

    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age <= 0) {
            System.out.println("возвраст не может быть меньше нуля.");
        } else {
            this.age = age;
        }
    }

    void setNameAndAge(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void speak() {
        System.out.println("Меня зовут " + name + ", мне " + age + " лет");
    }
}

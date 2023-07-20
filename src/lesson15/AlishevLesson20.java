package lesson15;

public class AlishevLesson20 {
    public static void main(String[] args) {
        Human2 human1 = new Human2("Vasya", 10);
        Human2 human2 = new Human2();

    }
}
class Human2{
    private String name;
    private int age;

    public Human2(String name, int age) {
        System.out.println("ПРИВЕТ ИЗ ПЕРВОГО КОНСТРУКТОРА!!!");
        this.name = name;
        this.age = age;
    }
    public Human2(){
        System.out.println("ПРИВЕТ ИЗ ВТОРОГО КОНСТРУКТОРА!!!");

    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
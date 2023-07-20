package lesson15;

public class AlishevLesson19 {
    public static void main(String[] args) {
        Human human1 = new Human();
        human1.setAge(18);
        human1.setName("Dima");

        Human human2 = new Human();
        human2.setAge(17);
        human2.setName("Anya");

        human1.getInfo();
        human2.getInfo();
    }
}

class Human {
    private String name;
    private int age;

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void getInfo() {
        System.out.println(name + ", " + age);
    }
}

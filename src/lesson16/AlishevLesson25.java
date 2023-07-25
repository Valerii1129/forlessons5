package lesson16;

public class AlishevLesson25 {
    public static void main(String[] args) {
        People p1 = new People("Bob", 40);
        System.out.println(p1);

    }
}

class People {
    private final String name;
    private final int age;

    public People(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return name + ", " + age;
    }
}
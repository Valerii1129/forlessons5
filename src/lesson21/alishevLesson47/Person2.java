package lesson21.alishevLesson47;

public class Person2 {
    private int id;
    private String name;
    private int age;
    private byte type;

    public Person2(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
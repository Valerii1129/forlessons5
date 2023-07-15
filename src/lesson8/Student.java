package lesson8;

public class Student implements Cloneable {
    private String name;
    private int age;
    private Phone phone;

    public Student(String name, int age, Phone phone) {
        this.name = name;
        this.age = age;
        this.phone = phone;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", phone=" + phone +
                '}';
    }

    @Override
    protected Student clone() throws CloneNotSupportedException {
        return new Student(name, age, phone.clone());
    }
}
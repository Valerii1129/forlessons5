package lesson8;

public class Student implements Cloneable {
    private String phone;
    private String name;
    private int age;

    public Student(String phone, String name, int age) {
        this.phone = phone;
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "phone='" + phone + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
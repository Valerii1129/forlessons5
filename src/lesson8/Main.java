package lesson8;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("Iphone", "Vasya", 16);
        try {
            Student student2 = (Student) student1.clone();

            student1.setName("Alex");

            System.out.println(student1);
            System.out.println(student2);
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }
}

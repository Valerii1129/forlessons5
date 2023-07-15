package lesson8;

public class Main {
    public static void main(String[] args) {
        Phone phone = new Phone("Iphone", 14);
        Student student1 = new Student("Vasya", 16, phone);
        try {
            Student student2 = (Student) student1.clone();

            phone.setModel("Xiaomi");
            phone.setVersion("11");

            System.out.println(student1);
            System.out.println(student2);
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }
}

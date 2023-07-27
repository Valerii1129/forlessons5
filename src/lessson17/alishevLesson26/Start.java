package lessson17.alishevLesson26;

public class Start {
    public static void main(String[] args) {
        /*Animal animal = new Animal(1);
        Person person= new Person("Bob");
        animal.showInfo();
        person.showInfo();*/
        Info info1 = new Animal(1);
        Info info2 = new Person("Bob");
//        info1.showInfo();
//        info2.showInfo();
        outputInfo(info1);
        outputInfo(info2);
    }

    public static void outputInfo(Info info) {
        info.showInfo();
    }
}
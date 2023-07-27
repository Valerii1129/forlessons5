package lessson17.alishevLesson26;

public class Animal implements Info {
    private int id;

    public Animal(int id) {
        this.id = id;
    }

    public void sleep() {
        System.out.println("I am sleep");
    }

    @Override
    public void showInfo() {
        System.out.println("id is " + this.id);
    }
}

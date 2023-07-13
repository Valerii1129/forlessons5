package lesson12.work;

public class Main {
    public static void main(String[] args) {
        Storage<Integer, String> box = new Storage<>();
        box.put(1, "Vlad");
        box.put(2, "David");
        box.put(3, "Egor");
        try {
            System.out.println(box.get(3));
        } catch (NullPointerException e) {
            System.out.println("нету данного об'экта");
        }
    }
}
package lesson9;

public class Main {
    public static void main(String[] args) {
        MyLinkedList<String> myLinkedList = new MyLinkedList<>();
        myLinkedList.add("first");
        myLinkedList.add("second");
        myLinkedList.add("third");
        myLinkedList.add("fourth");
        myLinkedList.add("fifeth");
        System.out.println(myLinkedList);
        System.out.println(myLinkedList.get(5));
    }
}

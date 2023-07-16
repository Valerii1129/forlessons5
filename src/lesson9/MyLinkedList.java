package lesson9;

public class MyLinkedList<T> {
    private Node first;
    private Node last;
    private int size;

    public void add(T value) {
        Node<T> node = new Node<>(null, null, value);
        size++;
        if (size == 1) {
            last = node;
            first = node;
        } else {
            last.next = node;
            node.prev = last;
            last = node;
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (first == null) return null;

        Node node = first;
        while (node != null) {
            sb.append(node.value).append(" ");
            node = node.next;
        }
        return sb.toString();
    }

    public T get(int index) {
        if (index < 0 || index >= size) throw new NullPointerException("НУЛЛ");
        Node current = first;

        for (int i = 0; i < index; i++) {
            current = current.next;
        }

        return (T) current.value;
    }

    class Node<T> {
        private Node prev;
        private Node next;
        private T value;

        public Node(Node prev, Node next, T value) {
            this.prev = prev;
            this.next = next;
            this.value = value;
        }

        public Node getPrev() {
            return prev;
        }

        public void setPrev(Node prev) {
            this.prev = prev;
        }

        public Node getNext() {
            return next;
        }

        public void setNext(Node next) {
            this.next = next;
        }

        public T getValue() {
            return value;
        }

        public void setValue(T value) {
            this.value = value;
        }
    }
}
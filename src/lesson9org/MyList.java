package lesson9org;

public interface MyList<T> {
    void add(T value);

    void add(T value, int index);

    void addAll(MyList<T> list);

    T get(int index);

    void set(T value, int index);

    T remove(int index);//возвращает елемент, который удалили

    T removeElem(T e);

    int size();

    boolean isEmpty();
}

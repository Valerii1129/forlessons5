package lesson9org;

import java.util.Arrays;

public class MyArrayList<T> implements MyList<T> {

    private T[] values = (T[]) new Object[10];
    private int size;

    public void add(T value) {
        if (size == values.length) {
            grow();
        }
        values[size] = value;
        size++;
    }

    @Override
    public void add(T value, int index) {

        if (size == index) {
            add(value);
            return;
        } else {
            scheckIndex(index);
        }
        if (size == values.length) {
            grow();
        }
        System.arraycopy(values, index, values, index + 1, size - index);
        values[index] = value;
        size++;
    }

    private void scheckIndex(int index) {
        if (index < 0 || index >= values.length) throw new IndexOutOfBoundsException("Вы вишли за пределы массива");
    }

    @Override
    public void addAll(MyList<T> list) {
        if (list != null) {
            if (values.length > size + list.size()) {
                values = Arrays.copyOf(values, size + list.size());
            }
            for (int i = 0, j = size; i < list.size(); i++, j++) {
                values[j] = list.get(i);
            }
            size += list.size();
        }
    }

    @Override
    public int size() {
        return size;
    }

    private void grow() {
        values = Arrays.copyOf(values, values.length * 3 / 2);
    }

    @Override
    public T get(int index) {
        scheckIndex(index);
        T e = values[index];
        return e;
    }

    @Override
    public void set(T value, int index) {
        scheckIndex(index);
        values[index] = value;
    }

    @Override
    public T remove(int index) {
        scheckIndex(index);
        T removedElement = values[index];
        System.arraycopy(values, index + 1, values, index, size - index - 1);// 0, 1, 2, 3
        size--;
        values = Arrays.copyOf(values, size);
        return removedElement;
    }

    @Override
    public T removeElem(T e) {
        int index = indexOf(e);
        if (index >= 0)
            return remove(index);
        return null;
    }

    private int indexOf(T e) {
        int index = 0;
        for (T element : values) {
            if (element.equals(e))
                return index;
            index++;
        }
        return -1;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public String toString() {
        return "MyArrayList - " + Arrays.toString(values);
    }
}


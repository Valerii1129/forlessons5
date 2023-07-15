package lesson12.work;

import java.util.Arrays;

public class Storage<K, V> {
    private Entry<K, V>[] entries = new Entry[10];
    int size = 0;

    public void put(K key, V value) {
        Entry<K, V> entry = new Entry(key, value);
        if (size > entries.length) {
            grow();
        }
        entries[size] = entry;
        size++;

    }

    public V get(K key) {
        for (Entry<K, V> e : entries) {
            if (key.equals(e.getKey())) {
                return e.getValue();
            }
        }
        throw new NullPointerException();
    }

    private class Entry<K, V> {
        private K key;
        private V value;

        public Entry(K key, V value) {
            this.key = key;
            this.value = value;
        }

        public K getKey() {
            return key;
        }

        public V getValue() {
            return value;
        }
    }

    public void grow() {
        entries = Arrays.copyOf(entries, entries.length + 1);
    }
}

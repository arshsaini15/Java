package CollectionFramework.Map;

import java.util.Objects;

public class MyHashMap<K, V> {

    // Node class for linked list
    static class Node<K, V> {
        K key;
        V value;
        Node<K, V> next;

        Node(K key, V value) {
            this.key = key;
            this.value = value;
        }
    }

    private Node<K, V>[] buckets;
    private int capacity = 16;   // default size
    private int size = 0;
    private static final float LOAD_FACTOR = 0.75f;

    @SuppressWarnings("unchecked")
    public MyHashMap() {
        buckets = new Node[capacity];
    }

    // hash the key and check whether it is already assigned to any index or not.
    private int getIndex(K key) {
        int hash = (key == null) ? 0 : key.hashCode();
        return Math.abs(hash) % capacity;
    }

    public void put(K key, V value) {
        int index = getIndex(key);
        Node<K, V> head = buckets[index]; // take the node at index and compare to the current key value

        // Check if key already exists, if it does then update its value.
        while (head != null) {
            if (Objects.equals(head.key, key)) {
                head.value = value;
                return;
            }
            head = head.next;
        }

        // Insert new node at head (bucket[index] -> Node)
        Node<K, V> newNode = new Node<>(key, value);
        newNode.next = buckets[index]; // bucket[index] -> newNode -> Node
        buckets[index] = newNode;
        size++;

        // Resize if needed
        if ((float) size / capacity > LOAD_FACTOR) {
            resize();
        }
    }

    public V get(K key) {
        int index = getIndex(key);
        Node<K, V> head = buckets[index];

        while (head != null) {
            if (Objects.equals(head.key, key)) {
                return head.value;
            }
            head = head.next;
        }

        return null;
    }

    public void remove(K key) {
        int index = getIndex(key);
        Node<K, V> head = buckets[index];
        Node<K, V> prev = null;

        while (head != null) {
            if (Objects.equals(head.key, key)) {
                if (prev == null) {
                    buckets[index] = head.next;
                } else {
                    prev.next = head.next;
                }
                size--;
                return;
            }
            prev = head;
            head = head.next;
        }
    }

    @SuppressWarnings("unchecked")
    private void resize() {
        capacity *= 2;
        Node<K, V>[] newBuckets = new Node[capacity];

        for (Node<K, V> node : buckets) {
            while (node != null) {
                Node<K, V> next = node.next;

                int newIndex = getIndex(node.key);
                node.next = newBuckets[newIndex];
                newBuckets[newIndex] = node;

                node = next;
            }
        }

        buckets = newBuckets;
    }

    public int size() {
        return size;
    }

    public static void main(String[] args) {

    }
}

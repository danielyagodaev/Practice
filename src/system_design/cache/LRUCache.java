package system_design.cache;

import data_structers.generic.DoublyLinkedList;
import data_structers.generic.Node;

import java.util.HashMap;

public class LRUCache<T extends Comparable<T>> implements Cache<T> {

    private final HashMap<String, Node<T>> existingCacheItems;
    private final DoublyLinkedList<T> orderedByUseCacheItems;
    private final int capacity;

    public LRUCache(int capacity) {
        this.existingCacheItems = new HashMap<>();
        this.orderedByUseCacheItems = new DoublyLinkedList<>();
        this.capacity = capacity;
    }

    @Override
    public synchronized void add(String key, T data) {
        if (this.existingCacheItems.size() == this.capacity) {
            this.orderedByUseCacheItems.removeLast();
        }
        Node<T> toAddNode = this.orderedByUseCacheItems.addFirst(data);
        this.existingCacheItems.put(key, toAddNode);
    }

    @Override
    public synchronized T get(String key) {
        Node<T> desiredNode = this.existingCacheItems.get(key);
        if (desiredNode == null) {
            return null;
        }
        T data = desiredNode.getData();
        this.orderedByUseCacheItems.remove(desiredNode);
        this.orderedByUseCacheItems.addFirst(data);
        return data;
    }
}

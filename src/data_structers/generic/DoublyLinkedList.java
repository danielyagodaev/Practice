package data_structers.generic;

public class DoublyLinkedList<T extends Comparable<T>> {

    private Node<T> head;
    private Node<T> tail;
    private int size;

    public DoublyLinkedList() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    public int getSize() {
        return this.size;
    }

    public synchronized Node<T> getFirst() {
        return this.head;
    }

    public synchronized Node<T> getLast() {
        return this.tail;
    }

    public synchronized Node<T> addFirst(T item) {
        Node<T> toAdd = new Node<>(item);
        toAdd.setRight(this.head);
        this.head = toAdd;
        if (this.tail == null) {
            this.tail = toAdd;
        }
        this.size++;
        return toAdd;
    }

    public synchronized Node<T> addLast(T item) {
        Node<T> toAdd = new Node<>(item);
        toAdd.setLeft(this.tail);
        this.tail = toAdd;
        if (this.head == null) {
            this.head = toAdd;
        }
        this.size++;
        return toAdd;
    }

    public synchronized Node<T> get(T item) {
        Node<T> curr = this.head;
        while (curr != null && (curr.getData().compareTo(item) != 0)) {
            curr = curr.getRight();
        }
        return curr;
    }

    public synchronized boolean remove(Node<T> toRemove) {
        if (toRemove == this.head) {
            return this.removeFirst();
        } else if (toRemove == this.tail) {
            return this.removeLast();
        } else {
            this.removeNodeFromTheMiddle(toRemove);
            return true;
        }
    }

    public synchronized boolean removeFirst() {
        if (this.size == 1) {
            this.head = null;
            this.tail = null;
        } else {
            Node<T> next = this.head.getRight();
            next.setLeft(null);
            this.head = next;
        }
        this.size--;
        return true;
    }

    public synchronized boolean removeLast() {
        if (this.size == 1) {
            this.head = null;
            this.tail = null;
        } else {
            Node<T> prev = this.tail.getLeft();
            prev.setRight(null);
            this.tail = prev;
        }
        this.size--;
        return true;
    }

    private void removeNodeFromTheMiddle(Node<T> toRemove) {
        Node<T> prev = toRemove.getLeft();
        Node<T> next = toRemove.getRight();
        prev.setRight(next);
        next.setLeft(prev);
        this.size--;
    }

}

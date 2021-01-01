package data_structers.generic;

import data_structers.generic.Link;

public class LinkedList<T extends Comparable<T>> {

    protected Link<T> head;
    protected int size;

    public LinkedList(){
        this.head = null;
        this.size = 0;
    }

    public void add(Link<T> toAdd){
        toAdd.setNext(this.head);
        this.head = toAdd;
        this.size++;
    }

    public boolean delete(T data){
        boolean found = false;
        Link<T> curr = this.head, prev = null;
        while (curr != null){
            if (curr.getData().compareTo(data) == 0){
                found = true;
                break;
            }
            prev = curr;
            curr = curr.getNext();
        }
        if (found){
            if (prev == null){
                this.head = curr.getNext();
            }
            else{
                prev.setNext(curr.getNext());
            }
            this.size--;
        }
        return found;
    }

    public void printList(){
        this.head.print();
    }
}

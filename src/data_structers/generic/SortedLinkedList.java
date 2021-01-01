package data_structers.generic;

import data_structers.generic.Link;
import data_structers.generic.LinkedList;

public class SortedLinkedList<T extends Comparable<T>> extends LinkedList<T> {

    public SortedLinkedList(){
        super();
    }

    public void add(Link<T> toAdd){
        if (this.head == null){
            super.add(toAdd);
        }
        else{
            Link<T> curr = this.head, prev = null;
            while (curr != null && curr.getData().compareTo(toAdd.getData()) <= 0){
                prev = curr;
                curr = curr.getNext();
            }
            if (prev != null){
                prev.setNext(toAdd);
            }
            else{
                this.head = toAdd;
            }
            toAdd.setNext(curr);
        }
    }

}

package data_structers;

public class Link<T> {

    private final T data;
    private Link<T> next;

    public Link(T data){
        this.data = data;
        this.next = null;
    }

    public T getData(){
        return this.data;
    }

    public Link<T> getNext(){
        return this.next;
    }

    public void setNext(Link<T> next){
        this.next = next;
    }

    public void print(){
        Link<T> curr = this;
        while (curr != null){
            System.out.print(curr.data.toString() + "->");
            curr = curr.next;
        }
        System.out.println();
    }
}

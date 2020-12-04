package data_structers;

public class ListNode {

    private int _val;
    private ListNode _next;

    public ListNode(){
        this._val = 0;
        this._next = null;
    }

    public ListNode(int val){
        this._val = val;
        this._next = null;
    }

    public ListNode(int val, ListNode next){
        this._val = val;
        this._next = next;
    }

    public int getVal(){
        return this._val;
    }

    public ListNode getNext(){
        return this._next;
    }

    public void setNext(ListNode toSet){
        this._next = toSet;
    }
}

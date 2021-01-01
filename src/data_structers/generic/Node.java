package data_structers.generic;

public class Node<T extends Comparable<T>>{

    private final T _data;
    private Node<T> _left;
    private Node<T> _right;

    public Node(T data){
        this._data = data;
        this._left = null;
        this._right = null;
    }

    public T getData(){
        return this._data;
    }

    public Node<T> getLeft(){
        return this._left;
    }

    public void setLeft(Node<T> left){
        this._left = left;
    }

    public Node<T> getRight(){
        return this._right;
    }

    public void setRight(Node<T> right){
        this._right = right;
    }

}

package data_structers.generic;

public class BinarySearchTree<T extends Comparable<T>> {

    private Node<T> _root;

    public BinarySearchTree(){
        this._root = null;
    }

    public void addNode(Node<T> node){
        if (this._root == null){
            this._root = node;
        }
        else{
            addNodeHelper(this._root, node);
        }
    }

    private void addNodeHelper(Node<T> curr, Node<T> toAdd){
        if (toAdd.getData().compareTo(curr.getData()) < 0){
            if (curr.getLeft() == null){
                curr.setLeft(toAdd);
            }
            else{
                addNodeHelper(curr.getLeft(), toAdd);
            }
        }
        else{
            if (curr.getRight() == null){
                curr.setRight(toAdd);
            }
            else{
                addNodeHelper(curr.getRight(), toAdd);
            }
        }
    }

    public void printTree(){
        printTreeHelper(this._root);
        System.out.println();
    }

    private void printTreeHelper(Node<T> curr){
        if (curr != null){
            printTreeHelper(curr.getLeft());
            System.out.print(curr.getData().toString() + " ");
            printTreeHelper(curr.getRight());
        }
    }
}

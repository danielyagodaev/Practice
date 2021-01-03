package data_structers;

public class TreeNode {

    private int _val;
    private TreeNode _left;
    private TreeNode _right;

    public TreeNode(){
        this._val = 0;
        this._left = null;
        this._right = null;
    }

    public TreeNode(int val){
        this._val = val;
        this._left = null;
        this._right = null;
    }

    public TreeNode(int val, TreeNode left, TreeNode right){
        this._val = val;
        this._left = left;
        this._right = right;
    }

    public int getVal(){
        return this._val;
    }

    public void setVal(int val){
        this._val = val;
    }

    public TreeNode getLeft(){
        return this._left;
    }

    public void setLeft(TreeNode left){
        this._left = left;
    }

    public TreeNode getRight(){
        return this._right;
    }

    public void setRight(TreeNode right){
        this._right = right;
    }

}

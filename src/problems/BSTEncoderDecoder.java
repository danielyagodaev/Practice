package problems;

import data_structers.generic.Node;

import java.util.Stack;

public class BSTEncoderDecoder {

    public static String encode(Node<Integer> root){
        if (root == null){
            return "";
        }
        StringBuilder sb = new StringBuilder();
        encoderHelper(root, sb);
        return sb.substring(0, sb.length()-1);
    }

    private static void encoderHelper(Node<Integer> curr, StringBuilder sb){
        int val = (curr == null) ? -1 : curr.getData();
        sb.append(val).append(",");
        if (curr != null){
            encoderHelper(curr.getLeft(), sb);
            encoderHelper(curr.getRight(), sb);
        }
    }

    public static Node<Integer> decode(String s){
        String[] vals = s.split(",");
        if (vals.length > 0){
            Stack<Node<Integer>> stack = new Stack<>();
            Node<Integer> temp, last = null;
            for (int i=0; i<vals.length; i++){
                int currVal = Integer.parseInt(vals[i]);
                temp = new Node<>(currVal);
                if (currVal != -1){
                    stack.push(temp);
                }
                else{
                    do{
                        last = stack.peek();
                        if (last.getLeft() == null){
                            last.setLeft(temp);
                        }
                        else{
                            last.setRight(temp);
                            temp = last;
                            stack.pop();
                        }
                    }
                    while (stack.size() > 0 && last.getLeft() != null && last.getRight() != null);
                }
            }
            return last;
        }
        return null;
    }



}

package problems;

import data_structers.Link;

public class SimpleProblems {

    public static int maxSumArray(int[] nums){
        int res = 0, curr = 0;
        for (int i=0; i<nums.length; i++){
            curr = Math.max(curr+nums[i], nums[i]);
            res = Math.max(res, curr);
        }
        return res;
    }

    public static void printAllPermutations(String s){
        char[] toCharArray = s.toCharArray();
        printAllPermutationsRec(toCharArray, 0, toCharArray.length-1);
    }

    private static void swap(char[] str, int i, int j){
        char temp = str[i];
        str[i] = str[j];
        str[j] = temp;
    }

    private static void printAllPermutationsRec(char[] str, int start, int end){
        if (start == end){
            System.out.println(str);
        }
        else{
            for (int i=start; i<=end; i++){
                swap(str, i, start);
                printAllPermutationsRec(str, start+1, end);
                swap(str, start, i);
            }
        }
    }

    public static Link<Integer> reverseList(Link<Integer> l){
        Link<Integer> prev = null, curr = l, next;
        while (curr != null){
            next = curr.getNext();
            curr.setNext(prev);
            prev = curr;
            curr = next;
        }
        return prev;
    }

    public static void main(String[] args){
        Link<Integer> l1 = new Link<>(1);
        Link<Integer> l2 = new Link<>(2);
        Link<Integer> l3 = new Link<>(3);
        l2.setNext(l3);
        l1.setNext(l2);
        l1.print();
        Link<Integer> temp = reverseList(l1);
        temp.print();
    }
}

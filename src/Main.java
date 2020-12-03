import data_structers.BinarySearchTree;
import data_structers.Node;
import problems.BSTEncoderDecoder;
import tools.ReaderWriterLock;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static int generateRandomIndex(int[] arr){
        return (int) (Math.random() * arr.length);
    }

    public static void writerFunc(int[] arr, ReaderWriterLock readerWriterLock){
        for (int j=0; j<10; j++){
            readerWriterLock.writerStart();
            int i = generateRandomIndex(arr);
            int rnd = (int) (Math.random() * 1000);
            arr[i] = rnd;
            System.out.printf("Writing %d to index %d\n", rnd, i);
            readerWriterLock.writerEnd();
            try {
                Thread.sleep(50);
            }
            catch (Exception e){
                e.printStackTrace();
            }
        }
    }

    public static void readerFunc(int[] arr, ReaderWriterLock readerWriterLock){
        for (int j=0; j<5; j++){
            readerWriterLock.readerStart();
            int i = generateRandomIndex(arr);
            System.out.printf("Reading %d from index %d\n", arr[i], i);
            readerWriterLock.readerEnd();
            try {
                Thread.sleep(100);
            }
            catch (Exception e){
                e.printStackTrace();
            }
        }
    }


    public static void main(String []args){
        Node<Integer> n1 = new Node<>(6);
        Node<Integer> n2 = new Node<>(1);
        Node<Integer> n3 = new Node<>(8);
        Node<Integer> n4 = new Node<>(7);
        Node<Integer> n5 = new Node<>(9);
        Node<Integer> n6 = new Node<>(3);
        n1.setLeft(n2);
        n1.setRight(n3);
        n2.setRight(n6);
        n3.setLeft(n4);
        n3.setRight(n5);
        String encoding = BSTEncoderDecoder.encode(n1);
        System.out.println(encoding);
        Node<Integer> temp = BSTEncoderDecoder.decode(encoding);
        System.out.println(temp.getData().toString());
    }
}

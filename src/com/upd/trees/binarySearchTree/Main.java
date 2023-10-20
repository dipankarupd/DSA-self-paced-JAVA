package com.upd.trees.binarySearchTree;

public class Main {

    public static void main(String[] args) throws Exception{

        BST tree = new BST();
        tree.insert(11);
        tree.insert(7);
        tree.insert(4);
        tree.insert(19);
        tree.insert(13);
        tree.insert(2);
        tree.insert(8);
        tree.insert(10);
        tree.insert(5);
        tree.insert(32);
        tree.pord();

        tree.search(5);
        tree.search(88);
    }
}

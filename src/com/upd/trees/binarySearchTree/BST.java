package com.upd.trees.binarySearchTree;


import java.util.Scanner;
class Node {
    int data;
    Node leftChild;
    Node rightChild;

    Node(int val) {
        data = val;
        leftChild = null;
        rightChild = null;
    }
}
public class BST {

    Node root;
    void insert(int val) throws Exception{
        root = insertRecursive(root,val);
    }
    private Node insertRecursive(Node root, int val) throws Exception {
        // base condition:
        if(root == null) {
            Node node = new Node(val);
            root = node;
            return root;
        }

        else if(root.data < val) {
            root.rightChild = insertRecursive(root.rightChild,val);
        }
        else if(root.data > val) {
            root.leftChild = insertRecursive(root.leftChild,val);
        }
        else if(root.data == val) {
            throw new Exception("Duplicates not permitted");
        }
        return root;
    }
    public void pord() {
        preOrder(root);
    }
    private void preOrder(Node root) {
        if(root != null) {
            System.out.print(root.data + " ");
            preOrder(root.leftChild);
            preOrder(root.rightChild);
        }

    }

    public void search(int target) {
     //   search2(root,target);
        search3(root,target);
    }
    private void search2(Node root, int target) {
        // base condition:
        if(root == null) {
            System.out.println("No such element");
            return;
        }
        if(root.data == target) {
            System.out.println("Successful search");

        } else if(root.data < target) {
            search2(root.rightChild,target);
        } else {
            search2(root.leftChild,target);
        }
    }

    private void search3(Node root, int target) {

        while(root != null) {
            if(root.data == target) {
                System.out.println("Element found..");
                return;
            } else if(root.data > target) {
                root = root.leftChild;
            } else {
                root = root.rightChild;
            }
        }
        System.out.println("No element found");
    }
}
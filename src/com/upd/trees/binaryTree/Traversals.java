package com.upd.trees.binaryTree;

import java.util.Scanner;

public class Traversals {
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        BinaryTree.Node node = tree.createTree();

        tree.inorderTraverse(node);
        System.out.println();
        tree.preOrderTraverse(node);
        System.out.println();
        tree.postOrderTraverse(node);
    }
}

class BinaryTree {
    class Node {
        int data;
        Node leftNode;
        Node rightNode;

        public Node(int data) {
            this.data = data;
            leftNode = null;
            rightNode = null;
        }
    }

    Node createTree() {
        Scanner scn = new Scanner(System.in);
        Node root = null;
        System.out.println("Enter the data: " );
        int data = scn.nextInt();

        if (data == -1) {
            return null;
        }
        root = new Node(data);
        System.out.println("Enter the left child of " + data);
        root.leftNode = createTree();
        System.out.println("Enter the right child of " + data);
        root.rightNode = createTree();
        return root;
    }
    //lnr
    void inorderTraverse(Node root) {
        if (root == null) {
            return;
        }
        inorderTraverse(root.leftNode);
        System.out.println(root.data);
        inorderTraverse(root.rightNode);
    }
    //nlr
    void preOrderTraverse(Node root) {
        if (root == null) {
            return;
        }
        System.out.println(root.data);
        preOrderTraverse(root.leftNode);
        preOrderTraverse(root.rightNode);
    }
    //lrn
    void postOrderTraverse(Node root) {
        if (root== null) {
            return;
        }
        postOrderTraverse(root.leftNode);
        postOrderTraverse(root.rightNode);
        System.out.println(root.data);
    }
}

package com.upd.linkedList.singlyLinkedList;

import java.util.ArrayList;
import java.util.Arrays;

public class MyLinkedList {

    public class Node {

        private int val;
        private Node next;

        public Node(int val) {
            this.val = val;
        }
    }

    private Node head;
    private Node tail;

    int size = 0;

    // insert(val) method:
    public void insertFirst(int val) {
        Node node = new Node(val);
        if(head == null) {
            head = node;

            head.next = null;
        } else {
            node.next = head;
            head = node;
        }
        size++;
    }


    //insertLast(val) method:
    public void insertLast(int val) {
        if(isEmpty()) {
            insertFirst(val);
        } else {
            Node node = new Node(val);
            Node temp = head;
            for(int i = 0;i < size-1; i++) {
                temp = temp.next;
            }
            temp.next = node;
            size++;

        }
    }

    //insert(index, val) method:

    public void insert(int index, int val){
        if(index == 0) {
            insertFirst(val);
        } else if (index == size) {
            insertLast(val);
        } else {
            Node temp = head;
            Node node = new Node(val);
            for(int i=0; i<index-1; i++) {
                temp = temp.next;
            }
            node.next = temp.next;
            temp.next = node;
            size++;
        }
    }

    // removeFirst() method:
    public void removeFirst() {
        if(isEmpty()) {
            return;
        } else {
            Node temp = head.next;
            head = temp;
            size--;
        }
    }

    // removeLast() method:
    public void removeLast() {
        if (size == 1) {
            removeFirst();
        } else {
            Node temp = head;
            for(int i=0; i<size-2; i++) {
                temp = temp.next;
            }
            temp.next = null;
            size--;
        }
    }

    //remove(index) method:
    public void remove(int idx) {

        if(idx == 0 || isEmpty() || size == 1) {
            removeFirst();
        } else if(idx == size-1) {
            removeLast();
        }
        else {
            Node temp = head;
            for(int i=0; i<idx-1; i++) {
                temp = temp.next;
            }
            temp.next = temp.next.next;
            size--;
        }
    }

    // reverse() method:
    public void reverse() {

//        Node temp = head;
//        while(temp.next != null) {
//            temp = temp.next;
//        }
//        tail = temp;
//        rev(head);
//
//        rev(head);

        rev(head,null);
    }

    private void rev(Node node, Node prev) {

//        if(node.next == null) {
//            head = tail;
//            return;
//        }
//
//        rev(node.next);
//        tail.next = node;
//        tail = node;
//        tail.next = null;

        if(node.next == null) {
            head = node;
            return;
        }
        rev(node.next,node);
        node.next = prev;
        node = prev;
        node.next = null;

    }


    // printList() method:
    public void printList(){

        ArrayList<Integer> list = new ArrayList<>();
        if (size == 0) {
            System.out.println("No element");
        } else {
            Node temp = head;
            while (temp != null) {
                list.add(temp.val);
                temp = temp.next;
            }
            System.out.print("[ ");
            for(int x: list) {
                System.out.print(x+" ");
            }
            System.out.println("]");
        }

    }

    //isEmpty() method:
    public boolean isEmpty() {
        return (size == 0 || head == null);
    }

}


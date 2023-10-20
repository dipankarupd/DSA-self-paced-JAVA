package com.upd.linkedList.doublyLinkedList;

import java.util.ArrayList;

public class MyLinkedList {

    public class Node {
        Node next;
        int val;
        Node prev;

        Node(int val) {
            this.val = val;
        }
    }

    private Node head;
    private int size = 0;

   // insert at first:
    public void insertFirst(int val) {
        Node node = new Node(val);

        if(isEmpty()) {
            head = node;
            head.next = null;
            head.prev = null;
            size++;
        } else {
            head.prev = node;
            node.next = head;
            head = node;
            head.prev = null;
            size++;
        }
    }

    // insert at last :
    public void insertLast(int val) {
        Node node = new Node(val);
        if (isEmpty()) {
            insertFirst(val);
        }
        else {
            Node temp = head;
//            for(int i=0; i<size-1; i++) {
//                temp = temp.next;
//            }
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = node;
            node.next = null;
            node.prev = temp;
            size++;
        }
    }

    public void insert(int val,int idx) {
        if (isEmpty()) {
            insertFirst(val);
        } else if(idx == size){
            insertLast(val);
        }
        else {
            Node temp = head;
            Node node = new Node(val);
            for(int i=0; i<idx; i++) {
                temp = temp.next;
            }
            Node temp2 = temp.prev;
            temp.prev = node;
            node.prev = temp2;
            temp2.next = node;
            node.next = temp;
            size++;
        }
    }

    // remove an element:
    public void remove() {
        if(size == 0) {
            return;
        } else if(size == 1) {
            head = null;
            size = size - 1;
        } else {
            Node temp = head.next;
            head.next = null;
            temp.prev = null;
            head = temp;
            size--;
        }
    }

    public void removeLast() {

        if(size == 1 || size == 0) {
            remove();
            return;
        }
        else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            Node temp2 = temp.prev;
            temp2.next = null;
            temp.prev = null;
            size--;
        }
    }

    public void remove(int idx) {
        if(idx == 0) {
            remove();
            return;
        } else if (idx == size - 1) {
            removeLast();
            return;
        } else {
            Node temp = head;
            for(int i=0; i<idx-1; i++) {
                temp = temp.next;
            }
            Node temp2 = temp.next.next;
            temp.next = temp2;
            temp2.prev = null;
            size--;
        }
    }

    public void reverse() {
        rev(head);
    }

    private void rev(Node node) {

        if(node.next == null) {

            node.next = node.prev;
            node.prev = null;
            head=node;
            return;
        }
        rev(node.next);
        Node temp = node.next;

        node.next = node.prev;
        node.prev = temp;

    }

//    public void printList(){
//
//        ArrayList<Integer> list = new ArrayList<>();
//        if (size == 0) {
//            System.out.println("No element");
//        } else {
//            Node temp = head;
//            while (temp != null) {
//                list.add(temp.val);
//                temp = temp.next;
//            }
//            System.out.print("[ ");
//            for(int x: list) {
//                System.out.print(x+" ");
//            }
//            System.out.println("]");
//        }
//
//    }

    public void printList() {

        Node temp = head;
        while(temp != null) {
            System.out.print(temp.val + "->");
            temp = temp.next;
        }
        System.out.println();
    }

    public boolean isEmpty() {
       return(head == null || size == 0);
    }
}

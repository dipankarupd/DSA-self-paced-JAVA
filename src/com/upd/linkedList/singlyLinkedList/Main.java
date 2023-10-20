package com.upd.linkedList.singlyLinkedList;

public class Main {

    public static void main(String[] args) {

        MyLinkedList list = new MyLinkedList();
//        for(int x = 1; x<=10; x++) {
//            list.insertFirst(x);
//        }
//        list.printList();
//
//        list.insertLast(0);
//        list.insertLast(-1);
//        list.printList();
//
//        list.insert(0,-9999);
//        list.insert(list.size, 12000);
//        list.insert(3,26);
//        list.printList();
//
//        list.removeFirst();
//        list.printList();
//        list.removeLast();
//        list.printList();
//        list.remove(2);
//        list.remove(list.size-1);
//        list.printList();

        list.insert(0,1);
        list.insert(1,2);
        list.insert(2,3);
        list.reverse();
        list.printList();

    }
}

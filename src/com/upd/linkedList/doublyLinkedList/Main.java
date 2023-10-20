package com.upd.linkedList.doublyLinkedList;

public class Main {
    public static void main(String[] args) {

        MyLinkedList list = new MyLinkedList();
        list.insertFirst(1);
        list.insertFirst(2);
        list.insertFirst(3);
        list.insertFirst(1000);
//
//        list.insertLast(0);
//        list.insertLast(-9999);
//
//        list.insert(5,2);
//
//        list.printList();
//
          list.remove();
//        list.printList();
//
//        list.removeLast();
//        list.printList();
//
//        list.remove(1);
//        list.printList();
//
//        list.reverse();
//        list.printList();

//        list.insert(1,0);
//        list.insert(2,1);
//        list.insert(3,2);
//

        list.reverse();
        list.printList();
    }
}

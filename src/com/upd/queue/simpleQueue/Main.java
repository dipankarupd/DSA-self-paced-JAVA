package com.upd.queue.simpleQueue;

public class Main {
    public static void main(String[] args) throws Exception {
        MyQueue queue = new MyQueue(3);

        queue.insert(1);
        queue.insert(2);
        queue.insert(3);

        System.out.println(queue.remove());
        System.out.println(queue.remove());
        System.out.println(queue.remove());
    }
}

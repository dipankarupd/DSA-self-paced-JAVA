package com.upd.queue.circularQueue;

public class Main {
    public static void main(String[] args) throws Exception {
        MyCircularQueue queue = new MyCircularQueue(3);

        queue.insert(1);
        queue.insert(2);
        System.out.println(queue.remove());
        queue.insert(3);
        queue.insert(4);

        System.out.println(queue.remove());
        System.out.println(queue.remove());
        System.out.println(queue.remove());
    }
}

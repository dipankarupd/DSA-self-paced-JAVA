package com.upd.queue.simpleQueue;

public class MyQueue {

    protected int[] arr;
    private static final int DEFAULT_SIZE = 10;

    public MyQueue() {
        arr = new int[DEFAULT_SIZE];
    }

    public MyQueue(int size) {
        arr =  new int[size];
    }

    private int end = 0;

    public boolean insert(int val) throws Exception {
        if (isFull()) {
            throw new Exception("Queue is full");
        }
        arr[end++] = val;
        return true;
    }

    public int remove() throws Exception {
        if (isEmpty()) {
            throw new Exception("Queue is Empty");
        }
        int temp = arr[0];
        for (int i = 1; i <arr.length ; i++) {
            arr[i-1] = arr[i];
        }
        end --;
        return temp;
    }

    private boolean isFull() {

        return (end == arr.length);
    }

    private boolean isEmpty() {
        return (end == 0);
    }
}

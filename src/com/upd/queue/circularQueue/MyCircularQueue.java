package com.upd.queue.circularQueue;

public class MyCircularQueue {

    protected int[] data;
    private static final int DEFAULT_SIZE = 10;

    // constructors:
    public MyCircularQueue () {
        data = new int[DEFAULT_SIZE];
    }
    public MyCircularQueue(int size) {
        data = new int[size];
    }

    private int start = -1, end = -1, size = 0;

    private boolean isFull() {
        return size == data.length;
    }
    private boolean isEmpty() {
        return size == 0;
    }

    public boolean insert(int val) throws Exception {
        if (isFull()) {
            throw new Exception("Queue full");
        } else {
            data[++end % data.length] = val;

            size++;
        }
        return true;
    }

    public int remove() throws Exception {
        if (isEmpty()) {
            throw new Exception ("Empty queue");
        } else {
            int temp = data[(++start % data.length)];
            size --;
            return temp;
        }
    }
}

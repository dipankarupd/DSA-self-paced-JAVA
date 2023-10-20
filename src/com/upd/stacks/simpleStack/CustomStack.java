package com.upd.stacks.simpleStack;

public class CustomStack {

    // instance variables:
    protected int[] arr;
    private static final int DEFAULT_SIZE = 10; // DEFAULT_SIZE can be used without the obj of CustonStack
    private int ptr = -1;

    // constructors:
    public CustomStack(int size) {

        this.arr = new int[size];
    }
    public CustomStack() {

        this(DEFAULT_SIZE);
    }

    // push method:
    public boolean push(int val) throws ArrayIndexOutOfBoundsException {

        if(isFull()) {
            throw new ArrayIndexOutOfBoundsException("Stack is full");
        }
        ptr = ptr + 1;
        arr[ptr] = val;
        return true;
    }

    protected boolean isFull() {
        return(ptr == arr.length - 1);
    }

    public int pop() throws Exception {
        if(isEmpty()) {
            throw new Exception("Empty stack");
        }
        return arr[ptr--];
    }

    protected boolean isEmpty() {

        return(ptr < 0);
    }

}

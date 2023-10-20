package com.upd.stacks.dynamicStack;

public class Main {

    public static void main(String[] args) throws Exception {

        MyDynamicStack stack = new MyDynamicStack(3);
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);

        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
    }
}

package com.upd.stacks.simpleStack;

public class Main {

    public static void main(String[] args) throws Exception {

        CustomStack stack = new CustomStack(3);
        stack.push(1);
        stack.push(2);
        stack.push(3);

        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
    }
}

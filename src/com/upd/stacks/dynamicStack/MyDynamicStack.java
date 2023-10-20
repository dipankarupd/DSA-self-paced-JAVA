package com.upd.stacks.dynamicStack;

import com.upd.stacks.simpleStack.CustomStack;

public class MyDynamicStack extends CustomStack {

   public MyDynamicStack () {
        super();
    }

    public MyDynamicStack(int size) {

       super(size);
    }

    public boolean push(int val) {

       if(this.isFull()) {
           int[] temp = new int[arr.length * 2];

           for (int i = 0; i < arr.length; i++) {

               temp[i] = arr[i];
           }
           arr = temp;
       }
       return super.push(val);
    }
}

package com.example.demo.Entity;

public class Stack {
    int top =-1;
    int stk[];
    int size;

    Stack(int size){
        this.size = size;
        stk = new int[size];
    }
    boolean isEmpty(){
        return top == -1;
    }
    boolean isFull(){
        return top == size-1;
    }
    int push(int data) {
        if (isFull()) {
            System.out.println("Stack Overflow");
//             return;
        } else {
            stk[++top] = data;
            return top;
        }
        return top;
    }
    int pop(){
        if (isEmpty()) {
            return -1;
        }
        int temp = top;
        top--;
        return stk[temp--];
    }
    int peek(){
        return stk[top];
    }

}

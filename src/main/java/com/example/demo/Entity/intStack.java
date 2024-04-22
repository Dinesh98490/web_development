package com.example.demo.Entity;

public class intStack {
    public static void main(String[] args) {
        Stack stk = new Stack(4);
        stk.push(1);
        stk.push(2);
        stk.push(3);
        System.out.println(stk.pop());
    }
}

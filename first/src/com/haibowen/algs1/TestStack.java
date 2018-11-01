package com.haibowen.algs1;

import edu.princeton.cs.algs4.Stack;
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class TestStack {
    public static void main(String[] args) {

        Stack<Integer> stack;
        stack=new Stack<Integer>();
        while (!StdIn.isEmpty())
            stack.push(StdIn.readInt());
        for (int i:stack){
            StdOut.println(i);
        }
    }
}

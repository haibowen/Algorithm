package com.haibowen.play;

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
            //System.out.println(i);
            StdOut.println(i);
        }

    }
}

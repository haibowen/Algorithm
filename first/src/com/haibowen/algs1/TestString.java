package com.haibowen.algs1;

import edu.princeton.cs.algs4.StdIn;

public class TestString {

    public static void main(String[] args) {
        String input= StdIn.readAll();
        String [] words=input.split("\\s+");
        System.out.println(words);

    }


}

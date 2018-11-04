package com.haibowen.algs1;

import edu.princeton.cs.algs4.StdOut;

import javax.xml.crypto.Data;

public class TestData {

    public static void main(String[] args) {


        int m=Integer.parseInt(args[0]);
        int n=Integer.parseInt(args[1]);
        int p=Integer.parseInt(args[2]);
        Date  date=new Date(m,n,p);
        StdOut.println(date);
    }
}

package com.haibowen.algs1;

import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.Queue;

public class TestQueen {

    public static void main(String[] args) {
        System.out.println(TestQueen.readInts("haibowen.top"));


    }


    public  static  int [] readInts(String name){

        In in=new In(name);
        Queue<Integer> q=new Queue<Integer>();
        while (!in.isEmpty())
            q.enqueue(in.readInt());
        int N=q.size();
        int [] a=new int[N];
        for (int i = 0; i <N ; i++)
            a[i]=q.dequeue();
            return  a;



    }
}

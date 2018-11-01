package com.haibowen.algs1;

import jdk.internal.org.objectweb.asm.tree.analysis.Value;


import java.security.Key;

public class TestRedAndBlackTree {

    private  static final  boolean RED=true;
    private static  final  boolean BLACK=false;
    private class Node
    {
        Key key;
        Value  value;
        int N;
        boolean color;
        Node(Key key, Value value,int N,boolean color){
            this.key=key;
            this.value=value;
            this.N=N;
            this.color=color;

        }
    }
    private boolean isRed(Node x){
        if(x==null)return false;
        return x.color==RED;
    }
}

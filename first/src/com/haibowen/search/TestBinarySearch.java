package com.haibowen.search;

import jdk.internal.org.objectweb.asm.tree.analysis.Value;

import java.security.Key;

public class TestBinarySearch {
    /**
     *
     * 基于有序数组的二分查找
     *
     * 
     */

    private Key [] keys;
    private Value [] values;
    private  int N;
    public TestBinarySearch(int capacity){

        keys= (Key[]) new Comparable[capacity];
        values= (Value[]) new Object[capacity];
    }
}

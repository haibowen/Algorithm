package com.haibowen.search;

import jdk.internal.org.objectweb.asm.tree.analysis.Value;

import java.security.Key;

import static edu.princeton.cs.algs4.BinaryStdIn.isEmpty;

public class TestBinarySearch <Key extends  Comparable<Key>,Value>{
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
    public  int size(){

        return  N;
    }
    public  Value get(Key key){
        if (isEmpty())
            return  null;
        int i=rank(key);
        if (i<N&&keys[i].compareTo(key)==0)

            return  values [i];

        else
            return null;

    }
    public  int rank(Key key){
        int lo =0;
         int hi=N-1;
         while (lo<=hi){
             int mid=lo+(hi-lo)/2;
             int cmp=key.compareTo(keys[mid]);
             if (cmp<0)
                 hi=mid-1;
             else  if (cmp>0)
                 lo=mid+1;
             else
                 return mid;


         }
         return lo;


    }

    public  void  put(Key key,Value value){
        int i=rank(key);
        if (i<N&&keys[i].compareTo(key)==0){
            values[i]=value;
            return;

        }
        for (int j=N; j>i;j--){

            keys[j]=keys[j-1];
            values[j]=values[j-1];
            keys[i]=key;
            values[i]=value;
            N++;
        }


    }
}

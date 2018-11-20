package com.haibowen.search;


import static edu.princeton.cs.algs4.BinaryStdIn.isEmpty;

/**
 *
 * 基于有序数组的二分查找
 */
public class TestBinearysearch<Key extends  Comparable<Key>,Value> {

    private  Key[] keys;
    private  Value [] values;
    private  int N;
    //构造函数
    public TestBinearysearch(int capacity){
        keys= (Key[]) new Comparable[capacity];
        values= (Value[]) new Comparable[capacity];

    }
    //数组的大小
public  int size(){

        return  N;

}
//查找给定的键，返回给定的键

public  Value get(Key key){

        if (isEmpty())
            return  null;
        int i=rank(key);
        if (i<N&&keys[i].compareTo(key)==0)
            return values[i];
        else
            return null;


}
public int rank(Key key){
        int lo=0;
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

}

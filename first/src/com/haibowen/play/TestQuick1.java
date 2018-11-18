package com.haibowen.play;

import edu.princeton.cs.algs4.StdRandom;

import java.util.Arrays;

public class TestQuick1 {

    public  static  void  sort(Comparable[] a){

        StdRandom.shuffle(a);
        sort(a,0,a.length-1);


    }

    private static  void  sort(Comparable []a,int lo,int hi){
        if (hi<lo)
            return;

        int j=partition(a,lo,hi);
        sort(a,lo,j-1);
        sort(a,j+1,hi);


    }
    private  static  int partition(Comparable []a,int lo,int hi){
        int i=lo;
        int j=hi+1;
        Comparable v=a[lo];
        while (true){

            while (less(a[++i],v))
                if (i==hi)
                    break;
                while (less(v,a[--j]))
                    if (j==lo)
                        break;
                    if (i>=j)
                        break;
                    exch(a,i,j);

        }
        exch(a,lo,j);
        return j;

    }
    private static void  exch(Comparable [] a,int i,int j){
        Comparable t=a[i];
        a[i]=a[j];
        a[j]=t;


    }
    private static boolean less(Comparable v,Comparable w){
        return v.compareTo(w)<0;

    }

    public static void main(String[] args) {

        Comparable [] isArray={45,35,23,44,13,66,48};
        sort(isArray);
        System.out.println(Arrays.toString(isArray));
    }
}

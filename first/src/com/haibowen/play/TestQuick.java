package com.haibowen.play;

import edu.princeton.cs.algs4.StdRandom;

import java.util.Arrays;

public class TestQuick {

    public  static  void  sort(Comparable []a){

        StdRandom.shuffle(a);
        sort(a,0,a.length-1);



    }
    public static  void  sort(Comparable[] a,int lo,int hi){
        if (hi<=lo)
            return;
        int j=partition(a,lo,hi);
        sort(a,lo,j-1);
        sort(a,j+1,hi);


    }
    private static  int partition(Comparable[]a,int lo,int hi){

        int i=lo;
        int j=hi+1;
        Comparable v=a[lo];
        while (true)
        {
            while (less(a[++i],v))
                if (i==hi) break;
                while (less(v,a[--j]))
                    if (j==lo) break;
                    if (i>=j) break;
                    change(a,i,j);
        }

        change(a,lo,j);
        return j;
    }
    public  static  boolean  less(Comparable v,Comparable w){

        return v.compareTo(w)<0;



    }
    public  static  void  change(Comparable[]a,int i,int j){
        Comparable t=a[i];
        a[i]=a[j];
        a[j]=t;



    }

    public static void main(String[] args) {

        Comparable [] a={2,4,6,8,9,123,1425,666};
        sort(a);
        System.out.println(Arrays.toString(a));


    }


}

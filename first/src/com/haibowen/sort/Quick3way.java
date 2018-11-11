package com.haibowen.sort;

import java.util.Arrays;

public class Quick3way {
    private  static  void  sort(Comparable[]a,int lo,int hi){

        if (hi<=lo)
        return;
        int lt=lo;
        int i=lo+1;
        int gt=hi;
        Comparable v=a[0];
        while (i<=gt){

            int cmp=a[i].compareTo(v);
            if (cmp<0)
                change(a,lt++,i++);
            else if (cmp>0)
                change(a,i,gt--);
            else i++;

        }
        sort(a,lo,lt-1);
        sort(a,gt+1,hi);

    }
    public  static  void  change(Comparable [] a,int i,int j){

        Comparable t=a[i];
        a[i]=a[j];
        a[j]=t;



    }

    public static void main(String[] args) {

        Comparable a[]={3,2,67,11,5,34,66,99,27};
        sort(a,0,8);
        System.out.println(Arrays.toString(a));
    }
}

package com.haibowen.play;

import java.util.Arrays;

public class TestMerge5 {

    private static Comparable[] aux;
    public  static  void  sort(Comparable []a){
        int N=a.length;
        aux=new Comparable[a.length];
        for (int sz = 1; sz <N ; sz=sz+sz)
            for (int lo = 0; lo <N-sz ; lo+=sz+sz) {
                merge(a,lo,lo+sz-1,Math.min(lo+sz+sz-1,N-1));

            }


    }
    public  static void  merge(Comparable [] a,int lo, int mid,int hi){

        int i=lo;
        int j=mid+1;
        for (int k = lo; k <a.length ; k++) {
            aux[k]=a[k];
        }
        for (int k = lo; k <a.length ; k++) {
            if (i>mid)
                a[k]=a[j++];
            else if (j>hi)
                a[k]=a[i++];
            else if (less(aux[j],aux[i]))
                a[k]=aux[j++];
            else
                a[k]=aux[i++];

        }

    }
    private static boolean less(Comparable v, Comparable w){
        return v.compareTo(w)<0;


    }
    public static void main(String[] args) {

        Comparable [] isArray={45,35,23,44,13,66,48};
        sort(isArray);
        System.out.println(Arrays.toString(isArray));
    }
}

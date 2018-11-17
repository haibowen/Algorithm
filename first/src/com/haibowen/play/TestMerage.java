package com.haibowen.play;

import java.util.Arrays;

public class TestMerage {
    private static  Comparable []aux;


    public  static  void  sort(Comparable []a){

        aux=new Comparable[a.length];
        sort(a,0,a.length-1);

    }
    private  static  void  sort(Comparable[] a,int lo,int hi){
        if (hi<=lo)
            return;
        int mid=lo+(hi-lo)/2;
        sort(a,lo,mid);
        sort(a,mid+1,hi);
        merge(a,lo,mid,hi);

    }
    private static void  merge(Comparable [] a,int lo,int mid,int hi){
        int i= lo;
        int j=mid+1;
     // Comparable   []aux=new Comparable[a.length];
        for (int k = lo; k <=hi ; k++) {
            aux[k]=a[k];



        }
        for (int k = lo; k <=hi ; k++) {
            if (i>mid)
                a[k]=aux[j++];
            else if(j>hi)
                a[k]=aux[i++];
            else if (less(aux[j],aux[i]))
                a[k]=aux[j++];
            else  a[k]=aux[i++];


        }
    }
    private static  boolean less(Comparable v,Comparable w){
        return v.compareTo(w)<0;


    }

    public static void main(String[] args) {

        Comparable [] isArray={45,35,23,44,13,66,48};
        sort(isArray);
        System.out.println(Arrays.toString(isArray));
    }

}

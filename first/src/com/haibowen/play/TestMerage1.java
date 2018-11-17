package com.haibowen.play;

import java.util.Arrays;

public class TestMerage1 {
    private static  Comparable [] aux;
    public  static  void sort(Comparable [] a,int lo,int hi){

        aux=new  Comparable[a.length];
        if (hi<=lo)
            return;
        int mid=lo+(hi-lo)/2;
        sort( a,lo,mid);
        sort(a,mid+1,hi);
        merge(a,lo,mid,hi);


    }
    public  static void  merge(Comparable[]a,int lo,int mid,int hi){


        int j=mid;
        for (int k = 0; k <a.length ; k++) {
            aux[k]=a[k];


        }
        for (int k = 0; k <a.length ; k++) {
            if (lo>mid)
                a[k]=aux[j++];
            else if (j>hi)
                a[k]=aux[lo++];
            else if (less(aux[j],aux[lo]))
                a[k]=aux[j++];
            else
                a[k]=aux[lo++];


        }

    }
    private static boolean less(Comparable v,Comparable w){
        return v.compareTo(w)<0;



    }

    public static void main(String[] args) {
        Comparable [] isArray={3,56,23,456,167,66,89,30};
        sort(isArray,0,isArray.length);
        System.out.println(Arrays.toString(isArray));
    }

}

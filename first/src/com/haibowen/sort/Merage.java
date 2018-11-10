package com.haibowen.sort;

import java.util.Arrays;

public class Merage {
    private  static  Comparable[]aux;

    public  static  void  sort(Comparable[]a){
        aux=new Comparable[a.length];
        sort(a,0,a.length-1);

    }
    private static  void  sort(Comparable[]a,int lo,int hi){

        if (hi<=lo)return;
        int mid=lo+(hi-lo)/2;
        sort(a,lo,mid);
        sort(a,mid+1,hi);
        merge(a,lo,mid,hi);


    }




    public  static  void  merge(Comparable []a ,int lo,int mid,int hi){


        int i=lo;
        int j=mid+1;
        Comparable [] aux = new Comparable[hi+1];
        for ( int k=lo;k<=hi;k++){
          aux[k]=a[k];


        }

        for (int k=lo;k<=hi;k++){

            if (i>mid){
                a[k]=aux[j++];
            }else if (j>hi){
                a[k]=aux[i++];
            }else if (less(aux[j],aux[i])){


                a[k]=aux[j++];
            }else {
                a[k]=aux[i++];
            }
        }


    }


    public  static  boolean  less(Comparable v,Comparable w){

        return v.compareTo(w)<0;
    }

    public static void main(String[] args) {


        Comparable [] a={3,2,6,3,5,89,345,123,345,67,3456,1,22,33,16};
        sort(a,0,14);
        System.out.println(Arrays.toString(a));
    }

}

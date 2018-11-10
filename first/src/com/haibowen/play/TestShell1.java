package com.haibowen.play;

import java.util.Arrays;

public class TestShell1 {

    public  static  void  sort(Comparable []a){

        int N=a.length;
        int h=1;
        while ( h<N/3) h=h*3+1;
        while (h>=1){


            for (int i = h; i <N ; i++) {


                for (int j = i; j >=h&&less(a[j],a[j-h]) ; j-=h) {

                    change(a,j,j-h);


                }


            }
            h=h/3;
        }


    }

    public  static boolean less(Comparable v,Comparable w){

        return v.compareTo(w)<0;



    }

    public  static  void  change(Comparable[] a,int i,int j){

        Comparable t=a[i];
        a[i]=a[j];
        a[j]=t;


    }

    public static void main(String[] args) {

        Comparable []a={2,3,1,45,22,33,56,15,13,99,2,3,1,45,22,33,56,15,13,99};
        sort(a);
        System.out.println(Arrays.toString(a));

    }
}

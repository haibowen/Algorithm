package com.haibowen.play;

import java.util.Arrays;

public class TestShell3 {

    /**
     *
     * 希尔排序
     *
     * @param a
     */
    public  static  void sort(Comparable [] a){

        int h=1;
        while (h<a.length/3)
            h=h*3+1;
        while (h>=1){
            for (int i = h; i <a.length ; i++) {
                for (int j = i; j >=h&& less(a[j],a[j-h]); j-=h) {
                    Comparable t=a[j];
                    a[j]=a[j-h];
                    a[j-h]=t;

                }

            }

            h=h/3;
        }


    }
    public  static  boolean less(Comparable v,Comparable w){
        return v.compareTo(w)<0;


    }

    public static void main(String[] args) {
        Comparable [] isArray={33,22,11,45,67,89,34,21,99};
        sort(isArray);
        System.out.println(Arrays.toString(isArray));
    }
}

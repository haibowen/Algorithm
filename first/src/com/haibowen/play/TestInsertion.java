package com.haibowen.play;

import java.util.Arrays;

public class TestInsertion {

    /**
     *
     * 插入排序
     * @param a
     */

    public  static  void  sort(Comparable [] a){
        for (int i = 1; i <a.length ; i++) {

            for (int j = i; j >0&&less(a[j],a[j-1]) ; j--) {
                Comparable t=a[j];
                a[j]=a[j-1];
                a[j-1]=t;

            }

        }


    }

    public  static  boolean less(Comparable v,Comparable w){

        return v.compareTo(w)<0;


    }

    public static void main(String[] args) {

        Comparable [] isArray={1,5,2,6,22,11,35,33};
        sort(isArray);
        System.out.println(Arrays.toString(isArray));
    }
}

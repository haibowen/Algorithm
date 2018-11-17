package com.haibowen.play;

import java.util.Arrays;

public class TestShell2 {

    public  static  void  sort(Comparable [] a){

        int h=1;
        while (h<a.length/3)
            h=3*h+1;
        while (h>=1){

            //将数组变为排序
            for (int i = h; i <a.length ; i++) {
                for (int j = i; j >=h&&less(a[j],a[j-h]) ; j-=h) {
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
        Comparable [] isArray={2,34,25,46,27,189};
        sort(isArray);
        System.out.println(Arrays.toString(isArray));


    }
}

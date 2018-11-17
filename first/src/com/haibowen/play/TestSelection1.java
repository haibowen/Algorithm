package com.haibowen.play;

import java.util.Arrays;

public class TestSelection1 {

    /**
     *
     * 选择排序练习
     *
     * @param a
     */

    public static void sort(Comparable[] a) {
        for (int i = 0; i < a.length; i++) {


            for (int j = i + 1; j < a.length; j++) {


                if (less(a[j], a[i])) {
                    Comparable t = a[j];
                    a[j] = a[i];
                    a[i] = t;


                }

            }

        }

    }

    public static boolean less(Comparable v, Comparable w) {
        return v.compareTo(w) < 0;


    }

    public static void main(String[] args) {

        Comparable[] isArray = {1, 5, 2, 3, 78, 23, 222};
        sort(isArray);
        System.out.println(Arrays.toString(isArray));
    }
}

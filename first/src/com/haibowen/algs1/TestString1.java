package com.haibowen.algs1;

public class TestString1 {

    public static void main(String[] args) {
        String a[]={"a","b","c","d","e"};
    TestString1.isSorted(a);

    }
    public  static  boolean isSorted(String []a){

        for (int i = 1; i <a.length ; i++) {

            if (a[i-1].compareTo(a[i])>0){
                return false;
            }

        }

        return true;
    }
}

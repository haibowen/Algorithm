package com.haibowen.algs1;

import java.util.Arrays;

public class TestBinearySearch {
    public static void main(String[] args) {
       int []a={6,12,3,4,5,56,8,98,9,11};
        Arrays.sort(a);
      //int b= BinearySearch.rank(5,a);
      int b=BinearySerarch2.rank(5,a);
        System.out.println("您查找的数值在该数组的第"+ b+"位"+"   " +"温馨提示您数组的下标从0开始计算");

    }


}

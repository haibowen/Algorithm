package com.haibowen.play;

public class TestSelection {

    public static void main(String[] args) {
        int b[] ={1,3,4,8,1,3,89,56,356,80};
        TestSelection.sort(b);
        for (int i = 0; i <b.length ; i++) {
            System.out.print(b[i]+"  ");

        }

    }
    public static void sort(int[]a){

        for (int i = 0; i <a.length ; i++) {
            int min=i;
            for (int j = i+1; j <a.length ; j++) {
                if (a[j]<a[i]){
                    min=a[i];
                    a[i]=a[j];
                    a[j]=min;

                }

            }

        }

    }
}

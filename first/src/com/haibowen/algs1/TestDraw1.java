package com.haibowen.algs1;

import edu.princeton.cs.algs4.StdDraw;
import edu.princeton.cs.algs4.StdRandom;

public class TestDraw1 {
    public static void main(String[] args) {
        int N=50;
        double[]a=new double[N];
        for (int i = 0; i <N ; i++) {
            a[i]= StdRandom.random();
            for (int j = 0; j < N; j++) {
               double x=1.0*j/N;
               double y=a[j]/2.0;
               double rw=0.5/N;
               double rh=a[i]/2.0;
                StdDraw.filledRectangle(x,y,rw,rh);


            }

        }
    }
}

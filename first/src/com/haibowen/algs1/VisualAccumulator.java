package com.haibowen.algs1;

import edu.princeton.cs.algs4.StdDraw;

public class VisualAccumulator {

    private double toal;
    private int N;

  public   VisualAccumulator(int trials,double max){
      StdDraw.setXscale(0,trials);
      StdDraw.setYscale(0,max);
      StdDraw.setPenRadius(.005);


    }
  public void   addDataValue(double val){
      N++;
      toal+=val;
      StdDraw.setPenColor(StdDraw.DARK_GRAY);
      StdDraw.point(N,val);
      StdDraw.setPenColor(StdDraw.RED);
      StdDraw.point(N,toal/N);


    }

}

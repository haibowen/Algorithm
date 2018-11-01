package com.haibowen.algs1;

public class Accumulator  {
    private double toal;
    private int N;
   public void addDataValue(double val){
        N++;
        toal+=val;

    }
    public double mean(){

       return toal/N;

    }
    public String toString(){

       return  "mean("+N+"values):"+String.format("%7.5f",mean());
    }
}

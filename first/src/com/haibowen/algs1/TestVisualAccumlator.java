package com.haibowen.algs1;

import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;



public class TestVisualAccumlator {
    public static void main(String[] args) {


/**
        // int T= Integer.parseInt(args[0]);
        Accumulator accumulator=new Accumulator();
        for (int i = 0; i <100 ; i++) {
            accumulator.addDataValue(StdRandom.random());
            System.out.println(accumulator);

        }
**/


      // int T= Integer.parseInt(args[0]);
       VisualAccumulator accumulator=new VisualAccumulator(10000,1.0);

        for (int i = 0; i <10000; i++) {
            accumulator.addDataValue(StdRandom.random());
            StdOut.println(accumulator);


        }


    }
}

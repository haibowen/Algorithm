package com.haibowen.play;

import edu.princeton.cs.algs4.StdIn;

public class TestGcd  {

    public static void main(String[] args) {

        int p= StdIn.readInt();
        int q=StdIn.readInt();

        int temp=  TestGcd.gcd(p,q);
        System.out.println("最大公约数为："+temp);

    }

    public static int gcd(int p,int q){




        if (q==0){
            return p;
        }
        int c=p%q;
        System.out.println(q+" "+c);
        return gcd(q,c);




    }
}

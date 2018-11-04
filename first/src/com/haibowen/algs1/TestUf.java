package com.haibowen.algs1;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

import static sun.net.ftp.FtpReplyCode.find;

public class TestUf {

    private  int [] id;
    private  int count;
    public  TestUf(int N){
        count =N;
        id=new int[N];
        for (int i = 0; i <N ; i++) {
            id[i]=i;

        }


    }
    public  int count(){
        return  count;
    }

    public static boolean connected(int p, int q){

        return  find(p)==find(q);

    }
   // public static int find(int p)
    //public void union(int p, int q)

    public  static  void  main(String[] args){

        int N= StdIn.readInt();
        TestUf  testUf=new TestUf(N);
        while (!StdIn.isEmpty())
        {

            int p=StdIn.readInt();
            int q=StdIn.readInt();
            if ((Boolean) TestUf.connected(p,q))
                continue;
            testUf.union(p,q);
            StdOut.println(p+" "+q);
        }
        StdOut.println(testUf.count()+"components");

    }

    private void union(int p, int q) {
    }

}


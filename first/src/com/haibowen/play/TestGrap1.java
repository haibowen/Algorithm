package com.haibowen.play;

public class TestGrap1 {

    /**
     *
     * 计算V的度数
     * @param testGrap
     * @param v
     * @return
     */
    public  static  int degree(TestGrap testGrap, int v){
        int degree=0;
        for (int w:testGrap.adj(v)) {
            degree++;

        }
        return degree;

    }

    /**
     *
     * 计算所有顶点的最大度数
     * @param testGrap
     * @return
     */
    public static  int maxDegree(TestGrap testGrap){

        int max=0;
        for (int i = 0; i <testGrap.V() ; i++) {
            if (degree(testGrap,i)>max)
                max=degree(testGrap,i);


        }
        return max;



    }

    /**
     *
     * 计算所有顶点的平均度数
     * @param testGrap
     * @return
     */
    public static  double avgDegree(TestGrap testGrap){
        return 2.0*testGrap.E()/testGrap.V();



    }

    /**
     *
     * 计算自环的个数
     * @param testGrap
     * @return
     */

    public  static int numberOfSelfLoops(TestGrap testGrap){

        int count=0;
        for (int v=0;v<testGrap.V();v++)
            for (int w:testGrap.adj(v))
                if (v==w)
                    count++;
                return count/2;
    }



}

package com.haibowen.play;

import com.haibowen.graph.DepthFirstPaths;

import java.util.Stack;

public class TestDepthFirstPaths {

    private boolean [] marked; //这个顶点上调用过dfs()了吗？
    private int [] edgeTo;  //从起点到一个顶点的已知路径上的最后一个顶点
    private final  int s;   //起点
    public TestDepthFirstPaths(TestGrap G,int s)
    {

        marked=new  boolean[G.V()];
        edgeTo=new int[G.V()];
        this.s=s;
        dfs(G,s);

    }
    private void  dfs(TestGrap G,int v){
        marked[v]=true;
        for (int w:G.adj(v))
            if (!marked[w]){
                edgeTo[w]=v;
                dfs(G,w);

            }
    }

    public boolean hasPathTo(int v){

        return marked[v];
    }
    public Iterable<Integer> pathTo(int v){

        if (!hasPathTo(v))
            return null;
        Stack<Integer> path=new Stack<Integer>();
        for (int x=v;x!=s;x=edgeTo[x])
            path.push(x);
        path.push(s);
        return path;
    }
}

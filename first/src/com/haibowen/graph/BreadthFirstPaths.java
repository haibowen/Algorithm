package com.haibowen.graph;

import java.util.Queue;

public class BreadthFirstPaths {
    private boolean [] marked;
    private int [] edgeTo;
    private final int s;
    public  BreadthFirstPaths(Graph G,int s)
    {
        marked=new boolean[G.V()];
        edgeTo=new int[G.V()];
        this.s=s;
        bfs(G,s);

    }
    private void bfs(Graph G,int s){

        Queue<Integer> queue =new  Queue<Integer>();
        marked[s]=true;
        queue.enqueue(s);
        while (!queue.isEmpty()){
            int v=queue.dequeue();
            for (int w:G.adj(v))
                if (!marked[w]){
                    edgeTo[w]=v;
                    marked[w]=true;
                    queue.enqueue(w);
                }

        }
    }

    public boolean hasPathTo(int v){
        return marked[v];

    }
    public Iterable<Integer> pathTo(int v){


    }
}

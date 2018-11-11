package com.haibowen.sort;

public class Heap {
    

    public  static  void  sort(Comparable []a ){

        int N=a.length;
        for (int k=N/2;k>=1;k--){
            sink(a,k,N );

        }
        while (N>1){
            exch(a,1,N--);
            sink(a,1,N);
        }

    }
    private  void sink(int k){

        while (2*k<=N){

            int j=2*k;
            if (j<N&&less(j,j+1))
                j++;
            if (!less(k,j))
                break;
            exch(k,j);
            k=j;
        }
    }
    public  static boolean less(Comparable v,Comparable w){
        return v.compareTo(w)<0;


    }
    public  static  void exch(Comparable [] a,int i,int j){
        Comparable t=a[i];
        a[i]=a[j];
        a[j]=t;

    }
}

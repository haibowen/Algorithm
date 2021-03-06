package com.haibowen.algs1;

import java.util.Iterator;

public class TestResizingArrayStack<Item> implements  Iterable<Item> {

    private  Item[] a=(Item[])new Object[1];//栈元素
    private int N=0;  //元素数量
    private boolean isEmpty(){
        return  N==0;
    }
    public  int size(){

        return N;
    }
    private void  resize(int max){

        Item[] items= (Item[]) new Object[max];
        for (int i = 0; i <N ; i++) {
            items[i]=a[i];
            a=items;

        }
    }
    public  void  push(Item item){
        if (N==a.length)resize(2*a.length);
        a[N++]=item;

    }
    public  Item pop(){

        Item item=a[--N];
        a[N]=null;
        if (N>0&&N==a.length/4) resize(a.length/2);
        return item;
    }
    @Override
    public Iterator<Item> iterator() {
        return  new ReverseArrayIterator();
    }
    private class ReverseArrayIterator implements  Iterator<Item>{
        private int i=N;

        @Override
        public boolean hasNext() {
            return i>0;
        }

        @Override
        public Item next() {
            return a[--i];
        }
        public  void  remove(){

        }
    }

}

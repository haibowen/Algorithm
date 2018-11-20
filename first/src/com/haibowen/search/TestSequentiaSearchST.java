package com.haibowen.search;

import jdk.internal.org.objectweb.asm.tree.analysis.Value;

import java.security.Key;

/**
 *
 * 基于链表的顺序查找
 */

public class TestSequentiaSearchST {


    private Node first;

    //定义链表

    private class  Node{

        private Key key;
        private  Node next;
        private Value value;

        public Node(Key key, Value value,Node next ) {
            this.key = key;
            this.next = next;
            this.value = value;
        }
    }

    //查找给定的键，返回相关联的值
    public  Value get(Key key){

        for (Node x=first;x!=null;x=x.next)
            if (key.equals(x.key))
                return x.value;
            return null;

    }
    //查找给定的键，找到更新其值，没有找到则在首位插入
    public  void  put(Key key,Value value){
        for (Node x=first;x!=null;x=x.next)
            if (key.equals(x.key)){

                x.value=value;
                return;

            }
            first=new Node(key,value,first);





    }
}

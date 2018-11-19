package com.haibowen.search;

import jdk.internal.org.objectweb.asm.tree.analysis.Value;

import javax.xml.soap.Node;
import java.security.Key;

public class TestSequentialSearchST {
    /**
     *
     * 基于无序链表的查找
     *
     */

    //首节点
    private Node first;
    private class Node{

       Key key;
       Value value;
       Node next;

        public Node(Key key, Value value, Node next) {
            this.key = key;
            this.value = value;
            this.next = next;
        }
    }
    public  Value get(Key key){
        for (Node x=first;x!=null;x=x.next)
            if (key.equals(x.key))
                return x.value;

            return null;

    }
    public  void  put(Key key,Value value){
        for (Node x=first;x!=null;x=x.next){
            if (key.equals(x.key)){
                x.value=value;
                return;
            }
            first=new Node(key,value,first);

        }


    }


}

package com.haibowen.search;

import edu.princeton.cs.algs4.BlackFilter;

import javax.xml.soap.Node;

public class TestRedBlackBST<Key extends  Comparable<Key>,Value> {
    private static final  boolean RED=true;
    private static final boolean BLACk=false;
    private Node root;
    private class Node{

        Key key;          //键
        Value value;      //值
        Node left,right;   //左右子树
        int N;           //这颗子树种的结点总数
        boolean color;    //由父结点指向链接的颜色
        Node(Key key,Value value,int N,boolean color){

            this.key=key;
            this.value=value;
            this.N=N;
            this.color=color;
        }
    }
    private boolean isRed(Node x){
        if (x==null)
            return false;
        return x.color==RED;



    }
    private  Node rotateLeft(Node h){
        Node x=h.right;
        h.right=x.left;
        x.left=h;
        x.color=h.color;
        h.color=RED;
        x.N=h.N;
        h.N=1+size(h.left)+size(h.right);
        return x;
    }

    private  Node rotateRight(Node h){
        Node x=h.left;
        h.left=x.right;
        x.right=h;
        x.color=h.color;
        h.color=RED;
        x.N=h.N;
        h.N=1+size(h.left)+size(h.right);
        return x;


    }
    private void  flipColors(Node h){
        h.color=RED;
        h.left.color=BLACk;
        h.right.color=BLACk;


    }
    private int size(){

        return size(root);
    }
    private int size(Node x){
        if (x==null)
            return 0;
        else
            return x.N;

    }
    public  void  put(Key key,Value value){
        root=put(root,key,value);
        root.color= BLACk;



    }
    public Node  put(Node h,Key key,Value value){
        if (h==null)
            return new Node(key,value,1,RED);
        int cmp=key.compareTo(h.key);
        if (cmp<0)
            h.left=put(h.left,key,value);
        else if (cmp>0)
            h.left=put(h.right,key,value);
        else
            h.value=value;
        if (isRed(h.right)&&!isRed(h.left))
            h=rotateLeft(h);
        if (isRed(h.left)&&isRed(h.left.left))
            h=rotateRight(h);
        if (isRed(h.left)&&isRed(h.right))
            flipColors(h);
        h.N=size(h.left)+size(h.right)+1;
        return h;



    }



}

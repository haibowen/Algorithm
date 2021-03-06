package com.haibowen.search;

public class BST<Key extends  Comparable<Key>,Value> {

    private Node root;
    private  class  Node{

        private Key key;//键
        private  Value value;//值
        private  Node left,right;//链接
        private int N;//以该节点为根的子树种的结点总数

        public Node(Key key, Value value,  int n) {
            this.key = key;
            this.value = value;
            N = n;
        }
    }

    public  int size(){

        return  size(root);
    }
    private int size(Node x){
        if (x==null)
            return 0;
        else
            return x.N;

    }
    public Value get(Key key){

        return  get(root,key);


    }
    private Value get(Node x,Key key){
        if (x==null)
            return null;
        int cmp=key.compareTo(x.key);
        if (cmp<0)
            return get(x.left,key);
        else if (cmp>0)
            return get(x.right,key);
        else
            return x.value;


    }
    public  void  put(Key key,Value value){
        root=put(root,key,value);
    }
    private Node put(Node x, Key key, Value value){
        if (x==null)
            return new Node(key,value,1);
        int cmp=key.compareTo(x.key);
        if (cmp<0)
            x.left=put(x.left,key,value);
        else if (cmp>0)
            x.right=put(x.right,key,value);
        else x.value=value;
        x.N=size(x.left)+size(x.right)+1;
        return x;


    }

    public  Key min(){
        return  min(root).key;
    }
    private Node min(Node x){
        if (x.left==null)
            return x;
        return min(x.left);
    }
    public Key floor(Key key){
        Node x=floor(root ,key);
        if (x==null)
            return null;
        return x.key;

    }
    private Node floor(Node x,Key key){
        if (x==null)
            return null;
        int cmp=key.compareTo(x.key);
        if (cmp==0)
            return x;
        if (cmp<0)
            return floor(x.left,key);
        Node t=floor(x.right,key);
        if (t!=null)
            return t;
        else return x;

    }
    public  Key select(int k){
        return select(root,k).key;


    }
    private Node select(Node x,int k){
        if (x==null)
            return null;
        int t=size(x.left);
        if (t>k)
            return select(x.left,k);
        else if (t<k)
            return select(x.right,k-t-1);
        else
            return x;


    }
    public  int rank(Key key){

        return rank(key,root);
    }
    private int rank(Key key,Node x){
        if (x==null)
            return  0;
        int cmp=key.compareTo(x.key);
        if (cmp<0)
            return rank(key,x.left);
        else if (cmp>0)
            return 1+size(x.left)+rank(key,x.right);
        else
            return size(x.left);

 

    }
}

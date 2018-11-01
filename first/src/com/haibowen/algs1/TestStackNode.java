package com.haibowen.algs1;

import javax.xml.soap.Node;
import java.util.Iterator;

public class TestStackNode <Item> implements Iterable<Item> {

    private Node first;
    private  int N;
    private  class  Node{

        Item item;
        Node next;

    }
    public  boolean isEmpty(){

        return  first==null;
    }
    public  int size(){

        return N;
    }
    public  void push(Item item){
        Node oldfirst=first;
        first =new Node();
        first.item=item;
        first.next=oldfirst;
        N++;
    }
    public  Item pop(){
        Item item=first.item;
        first=first.next;
        N--;
        return item;
    }
    @Override
    public Iterator<Item> iterator() {
        return null;
    }
}

package com.haibowen.algs1;

public class TestFile {
    public static void main(String[] args) {
        String s=args[0];
        int dot=s.indexOf(".");
        String base=s.substring(0,dot);
        String extension=s.substring(dot+1,s.length());
        System.out.println(base);
        System.out.println(extension);

    }


}

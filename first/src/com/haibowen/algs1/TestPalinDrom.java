package com.haibowen.algs1;

public class TestPalinDrom {

    public static void main(String[] args) {
        //System.out.println(TestPalinDrom.isPaliDrom("wenhaibo"));
        //System.out.println(TestPalinDrom.isPaliDrom("wenew"));
        //System.out.println(TestPalinDrom.isPpt("wenhaibo"));
        System.out.println(TestPalinDrom.isPpt("WENNEW"));
        System.out.println(TestPalinDrom.isPpt("wenew"));

    }
/**
    public  static boolean isPaliDrom(String s){

        int N=s.length();
        for (int i = 0; i <N/2 ; i++) {
            if (s.charAt(i)!=s.charAt(N-1-i)){
                return false;
            }

        }
        return  true;
    }
 **/

    public  static  boolean isPpt(String s){

        int N=s.length();
        for (int i = 0; i < N/2; i++) {
            if (s.charAt(i)!=s.charAt(N-1-i)){
                return false;
            }

        }

        return  true;
    }
}

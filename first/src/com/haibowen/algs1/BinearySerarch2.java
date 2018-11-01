package com.haibowen.algs1;

public class BinearySerarch2 {

   public static int rank(int key,int[]a){
        int lo=0;
        int hi=a.length-1;


         int mid=(lo+hi)/2;
        if (lo<hi){

            return -1;

        }else {

            if (key<a[mid]){
                hi=mid-1;

            }
            if (key>a[mid]){
                lo=mid+1;

            }

                return mid;
        }




        /**
      while (lo<=hi){

          int mid=(lo+hi)/2;
          if (key<a[mid]){
              hi=mid-1;
          }else if (key>a[mid]){
              lo=mid+1;
          }else {
              return mid;
          }
      }
  return -1;

         **/

    }
}

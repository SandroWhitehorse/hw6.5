package com.trylabs;

import java.math.BigDecimal;

public class Main {
private static boolean review( int array[], int i ){
for (int j=0;j<array.length-1;j++){
    if (array[j]==i) return true;
    }
return false;
}
    private static boolean review( double array[], double i ){
    BigDecimal bdi, bdj;
    bdi = new BigDecimal(Double.valueOf(i));
             for (int j=0;j<array.length;j++){
                 bdj = new BigDecimal(Double.valueOf(array[j]));
                 if (bdj.compareTo(bdi)==0) return true;
        }
    return false;

    }


    public static void main(String[] args) {
      int array [] = {32,55,66,77,88,64};
      int i=66;
      double dArray[]={33,45,67,89,0,66,4.333};
      double k = 4.333;
      if (review(array,i))
        System.out.println("В первом массиве есть нужное число");
      if (review(dArray,k))
        System.out.println("Во втором массиве есть нужное число");
         }
    }


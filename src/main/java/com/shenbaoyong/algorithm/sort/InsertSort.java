package com.shenbaoyong.algorithm.sort;

/**
 * Created by Shen Baoyong on 2017/4/4.
 */
public class InsertSort {
    public static void insertSort(int [] a){
        int len = a.length;
        int temp = 0;
        int j = 0;
        for(int i = 0 ; i < len ; i++)
        {
            temp = a[i];
            //假如temp比前面的值小，则将前面的值后移
            for(j = i ; j > 0 && temp < a[j-1] ; j --)
            {
                a[j] = a[j-1];
            }
            a[j] = temp;
        }
    }
}

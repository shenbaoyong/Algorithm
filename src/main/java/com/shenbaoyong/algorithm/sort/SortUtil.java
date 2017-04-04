package com.shenbaoyong.algorithm.sort;

/**
 * Created by Shen Baoyong on 2017/4/4.
 */
public class SortUtil {

    /**
     *判断数组是不是升序排列的
     */
    public static boolean isAscendingOrder(int[] a){
        if(a == null){
            throw new NullPointerException("传入的数组是空指针");
        }

        int len = a.length;
        if(len == 0 || len == 1){
            return true;
        }
        for (int i = 0; i < len - 1; i++){
            if(a[i] > a[i+1]){
                return false;
            }
        }
        return true;
    }

    /**
     *判断数组是不是降序排列的
     */
    public static boolean isDescendingOrder(int[] a){
        if(a == null){
            throw new NullPointerException("传入的数组是空指针");
        }

        int len = a.length;
        if(len == 0 || len == 1){
            return true;
        }
        for (int i = 0; i < len - 1; i++){
            if(a[i] < a[i+1]){
                return false;
            }
        }
        return true;
    }
}

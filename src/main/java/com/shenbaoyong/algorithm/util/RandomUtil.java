package com.shenbaoyong.algorithm.util;

/**
 * Created by Shen Baoyong on 2017/4/4.
 */
public class RandomUtil {
    /**
     * 生成若干个随机数
     * @param number 生成的个数
     * @param from   最小值
     * @param to     最大值
     * @return 生成的数组
     */
    public static int[] generatedigit(int number, int from, int to) throws Exception{
        if (number < 0) {
            throw new NegativeArraySizeException("number 不能为负数");
        }else if(number == 0){
            return new int[0];
        }else if(from > to){
            throw new Exception("from 不能 大于 to");
        }

        int[] a = new int [number];
        for (int i = 0; i < number; i++){
            a[i] = (int)(Math.random() * (to - from) + from);
        }
        return a;
    }

    /**
     *默认范围是-1000 到 1000
     */
    public static int[] generatedigit(int number) throws Exception {
        return generatedigit(number, -1000, 1000);
    }

    /**
     *默认生成个数是100个
     */
    public static int[] generatedigit() throws Exception {
        return generatedigit(100);
    }
}

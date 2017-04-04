package com.shenbaoyong.algorithm.sort;

import com.shenbaoyong.algorithm.util.RandomUtil;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Shen Baoyong on 2017/4/4.
 */
public class InsertSortTest {
    @Test
    public void test()throws Exception{
        int [] a = RandomUtil.generatedigit();
        InsertSort.insertSort(a);
        Assert.assertTrue(SortUtil.isAscendingOrder(a));
    }
}

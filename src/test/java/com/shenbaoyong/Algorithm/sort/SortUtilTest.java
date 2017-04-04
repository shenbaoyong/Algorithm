package com.shenbaoyong.algorithm.sort;

import com.shenbaoyong.algorithm.util.RandomUtil;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Shen Baoyong on 2017/4/4.
 */
public class SortUtilTest {
    @Test
    public void test()throws Exception{
        int[] a = RandomUtil.generatedigit(1000);
        //随机成成了1000个数，他们是升序或降序的概率很小
        Assert.assertFalse(SortUtil.isAscendingOrder(a));
        Assert.assertFalse(SortUtil.isDescendingOrder(a));

        int [] b = {1,2,3,4,5,5,5,6,7};
        Assert.assertTrue(SortUtil.isAscendingOrder(b));
        Assert.assertFalse(SortUtil.isDescendingOrder(b));

        int [] c = {6,5,4,3,2,2,1,1};
        Assert.assertFalse(SortUtil.isAscendingOrder(c));
        Assert.assertTrue(SortUtil.isDescendingOrder(c));
    }
}

package com.vince.test;

import com.vince.bean.Clothes;
import com.vince.utils.ProductsXmlUtils;
import org.junit.Test;

import java.util.Arrays;

import java.util.List;

public class ProsuctsXmlUtilsTest {
    @Test
    public void test(){
        List<Clothes> clothes = ProductsXmlUtils.parserProductFromXml();
        System.out.println(Arrays.toString(clothes.toArray()));
    }
}

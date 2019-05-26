package com.vince.service.impl;

import com.vince.bean.Clothes;
import com.vince.service.ClothesService;
import com.vince.utils.BusinessException;
import com.vince.utils.ProductsXmlUtils;

import java.util.List;

public class ClothesServiceImpl implements ClothesService {
    @Override
    public List<Clothes> list() throws BusinessException{
        List<Clothes> clothes = ProductsXmlUtils.parserProductFromXml();
        return clothes;
    }
}

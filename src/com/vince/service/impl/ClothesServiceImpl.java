package com.vince.service.impl;

import com.vince.bean.Clothes;
import com.vince.service.ClothesService;
import com.vince.utils.BusinessException;
import com.vince.utils.ClothesIo;
import com.vince.utils.ProductsXmlUtils;

import java.util.List;

public class ClothesServiceImpl implements ClothesService {
    private   ClothesIo clothesIo = new ClothesIo();
    @Override
    public List<Clothes> list() throws BusinessException{
       return clothesIo.list();
        //List<Clothes> clothes = ProductsXmlUtils.parserProductFromXml();

    }


    @Override
    public Clothes findById(String cid) throws BusinessException {
        return clothesIo.findById(cid);
    }
    public void update() throws BusinessException{
        clothesIo.update();
    }
}

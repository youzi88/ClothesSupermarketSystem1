package com.vince.service;

import com.vince.bean.Clothes;
import com.vince.utils.BusinessException;

import javax.swing.plaf.nimbus.NimbusStyle;
import java.util.List;

public interface ClothesService {
    public List<Clothes> list() throws BusinessException;
}

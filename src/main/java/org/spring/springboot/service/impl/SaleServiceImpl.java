package org.spring.springboot.service.impl;

import org.spring.springboot.dao.SaleDao;
import org.spring.springboot.domain.ProductDef;
import org.spring.springboot.service.SaleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service("saleServiceImp")
public class SaleServiceImpl implements SaleService{

    @Autowired
    private SaleDao saleDao;

    public void addProduct(ProductDef productDef){

        saleDao.addProduct(productDef);
    }

}

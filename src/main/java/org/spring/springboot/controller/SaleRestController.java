package org.spring.springboot.controller;


import org.spring.springboot.domain.ProductDef;
import org.spring.springboot.service.SaleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class SaleRestController {
    @Autowired
    @Qualifier("saleServiceImp")
    private SaleService saleService;


    @RequestMapping(value = "addProduct", method = RequestMethod.POST)
    public void addProduct(@RequestBody ProductDef productDef){
        saleService.addProduct(productDef);
    }



}

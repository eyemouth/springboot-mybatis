package org.spring.springboot.dao;


import org.apache.ibatis.annotations.Param;
import org.spring.springboot.domain.ProductDef;

/**
 * 销售 DAO 接口类
 *
 * Created by zw on 11/24/2017.
 */
public interface SaleDao {
    /**
     * 新增商品
     *
     * @param productDef
     */

    void addProduct(@Param("productDef") ProductDef productDef);


}

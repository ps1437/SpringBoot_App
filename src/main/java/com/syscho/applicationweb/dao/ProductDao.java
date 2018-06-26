package com.syscho.applicationweb.dao;


import com.syscho.applicationweb.model.ProductVo;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface ProductDao {

    public ProductVo saveProd(ProductVo prod);
    public boolean removeProd(long prodId);
    public ProductVo updateProd(ProductVo uProd);
    public List<ProductVo> viewAllProds();
    public ProductVo viewProdById(long prodId);
    public List<ProductVo> viewProdByName(String prodName);
    public List<ProductVo> viewProdByPriceRange(long minPrice , long maxPrice);
    public List<ProductVo> viewProdByType(String prodType);

}

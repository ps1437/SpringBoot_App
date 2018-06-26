package com.syscho.applicationweb.services;



import com.syscho.applicationweb.model.ProductVo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ProductService {
    public ProductVo addProd(ProductVo prod);
    public boolean delProd(long prodId);
    public ProductVo updateProd(ProductVo uProd);
    public List<ProductVo> viewAllProd();
    public ProductVo viewProdById(long prodId);
    public List<ProductVo> viewProdByName(String prodName);
    public List<ProductVo> viewProdByPriceRange(long minPrice , long maxPrice);
    public List<ProductVo> viewProdByType(String prodType);
}

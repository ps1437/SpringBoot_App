package com.syscho.applicationweb.services;

import com.syscho.applicationweb.dao.ProductDao;
import com.syscho.applicationweb.model.ProductVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ProductServiceImpl implements  ProductService {

    ProductDao productDao;

    @Autowired(required = true)
    public void setProductDao(ProductDao productDao) {
        this.productDao = productDao;
    }

    @Override
    public ProductVo addProd(ProductVo prod) {
        return productDao.saveProd(prod);
    }

    @Override
    public boolean delProd(long prodId) {
        return productDao.removeProd(prodId);
    }

    @Override
    public ProductVo updateProd(ProductVo uProd) {
        return productDao.updateProd(uProd);
    }

    @Override
    public List<ProductVo> viewAllProd() {
        return productDao.viewAllProds();
    }

    @Override
    public ProductVo viewProdById(long prodId) {
        return productDao.viewProdById(prodId);
    }

    @Override
    public List<ProductVo> viewProdByName(String prodName) {
        return productDao.viewProdByName(prodName);
    }

    @Override
    public List<ProductVo> viewProdByPriceRange(long minPrice, long maxPrice) {
        return productDao.viewProdByPriceRange(minPrice,maxPrice);
    }

    @Override
    public List<ProductVo> viewProdByType(String prodType) {
        return productDao.viewProdByType(prodType);
    }
}

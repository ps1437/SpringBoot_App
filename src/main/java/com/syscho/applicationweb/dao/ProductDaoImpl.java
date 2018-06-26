package com.syscho.applicationweb.dao;

import com.syscho.applicationweb.model.ProductVo;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;


@Repository
public class ProductDaoImpl  implements  ProductDao {

    static List<ProductVo> db= new ArrayList<ProductVo>();
    static{
        db.add(new ProductVo(1,"Gucchi Fun",2500,"Begs","Gucchi"));
        db.add(new ProductVo(2,"Gucchi Stone",1500,"Begs","Gucchi"));
        db.add(new ProductVo(3,"Raymonds Shirt",1700,"Shirts","Raymonds"));


    }
    @Override
    public ProductVo saveProd(ProductVo prod) {
       boolean flag = db.add(prod);
       if(flag)
           return prod;
        return null;
    }

    @Override
    public boolean removeProd(long prodId) {
        return true;
    }

    @Override
    public ProductVo updateProd(ProductVo uProd) {
        boolean flag = db.add(uProd);
        if(flag)
            return uProd;

        return null;
    }

    @Override
    public List<ProductVo> viewAllProds() {
        return db;
    }

    @Override
    public ProductVo viewProdById(long prodId) {
        return null;
    }

    @Override
    public List<ProductVo> viewProdByName(String prodName) {
        return db;
    }

    @Override
    public List<ProductVo> viewProdByPriceRange(long minPrice, long maxPrice) {
        return db;
    }

    @Override
    public List<ProductVo> viewProdByType(String prodType) {
        return db;
    }
}

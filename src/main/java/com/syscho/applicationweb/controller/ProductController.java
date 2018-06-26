package com.syscho.applicationweb.controller;

import com.syscho.applicationweb.model.ProductVo;
import com.syscho.applicationweb.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
@RestController
@RequestMapping("/products")
public class ProductController {

    ProductService productService;
            @Autowired
    public void setProductService(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping(name = "/saveProduct")
        public ProductVo saveProduct(@RequestBody  ProductVo productVo){
                System.out.print("saveProduct");
                return productService.addProd(productVo);
    }

    @GetMapping(name = "/viewAllProd")
    public List<ProductVo> viewAllProducts(){
        System.out.print("saveProduct");
        return productService.viewAllProd();
    }

}

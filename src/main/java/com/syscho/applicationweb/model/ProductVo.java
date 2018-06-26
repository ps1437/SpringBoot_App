package com.syscho.applicationweb.model;

public class ProductVo {

    private long prodId;
    private String prodName;
    private long prodPrice;
    private String prodType;
    private String prodBrand;

    public ProductVo() {
    }

    public ProductVo(long prodId, String prodName, long prodPrice, String prodType, String prodBrand) {
        this.prodId = prodId;
        this.prodName = prodName;
        this.prodPrice = prodPrice;
        this.prodType = prodType;
        this.prodBrand = prodBrand;
    }

    public long getProdId() {
        return prodId;
    }

    public void setProdId(long prodId) {
        this.prodId = prodId;
    }

    public String getProdName() {
        return prodName;
    }

    public void setProdName(String prodName) {
        this.prodName = prodName;
    }

    public long getProdPrice() {
        return prodPrice;
    }

    public void setProdPrice(long prodPrice) {
        this.prodPrice = prodPrice;
    }

    public String getProdType() {
        return prodType;
    }

    public void setProdType(String prodType) {
        this.prodType = prodType;
    }

    public String getProdBrand() {
        return prodBrand;
    }

    public void setProdBrand(String prodBrand) {
        this.prodBrand = prodBrand;
    }
}

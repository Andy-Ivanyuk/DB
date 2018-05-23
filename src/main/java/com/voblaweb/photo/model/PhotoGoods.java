package com.voblaweb.photo.model;

public class PhotoGoods {
    private int goodId;
    private String goodName;
    private int goodTypeGoodTypeId;
    private int suppliersSupplierId;

    public PhotoGoods(int goodId, String goodName, int goodTypeGoodTypeId, int suppliersSupplierId) {
        this.goodId = goodId;
        this.goodName = goodName;
        this.goodTypeGoodTypeId = goodTypeGoodTypeId;
        this.suppliersSupplierId = suppliersSupplierId;
    }

    public int getGoodId() {
        return goodId;
    }

    public void setGoodId(int goodId) {
        this.goodId = goodId;
    }

    public String getGoodName() {
        return goodName;
    }

    public void setGoodName(String goodName) {
        this.goodName = goodName;
    }

    public int getGoodTypeGoodTypeId() {
        return goodTypeGoodTypeId;
    }

    public void setGoodTypeGoodTypeId(int goodTypeGoodTypeId) {
        this.goodTypeGoodTypeId = goodTypeGoodTypeId;
    }

    public int getSuppliersSupplierId() {
        return suppliersSupplierId;
    }

    public void setSuppliersSupplierId(int suppliersSupplierId) {
        this.suppliersSupplierId = suppliersSupplierId;
    }
}

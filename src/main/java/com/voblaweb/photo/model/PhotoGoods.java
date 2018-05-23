package com.voblaweb.photo.model;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;

@Entity
@Table(name = "good")
@EntityListeners(AuditingEntityListener.class)
public class PhotoGoods {
    @Id
    @Column(name = "good_id")
    private int goodId;
    private String goodName;
    private int goodTypeGoodTypeId;
    private int suppliersSupplierId;

    public PhotoGoods(String goodName, int goodTypeGoodTypeId, int suppliersSupplierId) {
        this.goodName = goodName;
        this.goodTypeGoodTypeId = goodTypeGoodTypeId;
        this.suppliersSupplierId = suppliersSupplierId;
    }

    public PhotoGoods() {
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

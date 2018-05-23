package com.voblaweb.photo.model;

import java.util.Date;

public class OfficeOrders {
    private int officeOrdersId;
    private int photoGoodsPhotoGoodsId;
    private int kiosksKioskId;
    private Date dateOfSupply;
    private int amountOfGoods;
    private int price;
    private Date dateOfSelling;

    public OfficeOrders(int officeOrdersId, int photoGoodsPhotoGoodsId, int kiosksKioskId, Date dateOfSupply, int amountOfGoods, int price, Date dateOfSelling) {
        this.officeOrdersId = officeOrdersId;
        this.photoGoodsPhotoGoodsId = photoGoodsPhotoGoodsId;
        this.kiosksKioskId = kiosksKioskId;
        this.dateOfSupply = dateOfSupply;
        this.amountOfGoods = amountOfGoods;
        this.price = price;
        this.dateOfSelling = dateOfSelling;
    }

    public int getOfficeOrdersId() {
        return officeOrdersId;
    }

    public void setOfficeOrdersId(int officeOrdersId) {
        this.officeOrdersId = officeOrdersId;
    }

    public int getPhotoGoodsPhotoGoodsId() {
        return photoGoodsPhotoGoodsId;
    }

    public void setPhotoGoodsPhotoGoodsId(int photoGoodsPhotoGoodsId) {
        this.photoGoodsPhotoGoodsId = photoGoodsPhotoGoodsId;
    }

    public int getKiosksKioskId() {
        return kiosksKioskId;
    }

    public void setKiosksKioskId(int kiosksKioskId) {
        this.kiosksKioskId = kiosksKioskId;
    }

    public Date getDateOfSupply() {
        return dateOfSupply;
    }

    public void setDateOfSupply(Date dateOfSupply) {
        this.dateOfSupply = dateOfSupply;
    }

    public int getAmountOfGoods() {
        return amountOfGoods;
    }

    public void setAmountOfGoods(int amountOfGoods) {
        this.amountOfGoods = amountOfGoods;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Date getDateOfSelling() {
        return dateOfSelling;
    }

    public void setDateOfSelling(Date dateOfSelling) {
        this.dateOfSelling = dateOfSelling;
    }
}

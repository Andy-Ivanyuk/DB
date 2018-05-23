package com.voblaweb.photo.model;

import java.util.Date;

public class Supplies {
    private int suppliesId;
    private int kiosksKioskId;
    private int typeOfSuppliesTypeId;
    private int price;
    private int amountOfPhotosPerFrame;
    private int totalAmountOfPhotos;
    private String format;
    private String paperType;
    private Date supplyDate;
    private Boolean isDone;
    private int clientsClientId;

    public Supplies(int suppliesId, int kiosksKioskId, int typeOfSuppliesTypeId, int price, int amountOfPhotosPerFrame, int totalAmountOfPhotos, String format, String paperType, Date supplyDate, Boolean isDone, int clientsClientId) {
        this.suppliesId = suppliesId;
        this.kiosksKioskId = kiosksKioskId;
        this.typeOfSuppliesTypeId = typeOfSuppliesTypeId;
        this.price = price;
        this.amountOfPhotosPerFrame = amountOfPhotosPerFrame;
        this.totalAmountOfPhotos = totalAmountOfPhotos;
        this.format = format;
        this.paperType = paperType;
        this.supplyDate = supplyDate;
        this.isDone = isDone;
        this.clientsClientId = clientsClientId;
    }

    public int getSuppliesId() {
        return suppliesId;
    }

    public void setSuppliesId(int suppliesId) {
        this.suppliesId = suppliesId;
    }

    public int getKiosksKioskId() {
        return kiosksKioskId;
    }

    public void setKiosksKioskId(int kiosksKioskId) {
        this.kiosksKioskId = kiosksKioskId;
    }

    public int getTypeOfSuppliesTypeId() {
        return typeOfSuppliesTypeId;
    }

    public void setTypeOfSuppliesTypeId(int typeOfSuppliesTypeId) {
        this.typeOfSuppliesTypeId = typeOfSuppliesTypeId;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getAmountOfPhotosPerFrame() {
        return amountOfPhotosPerFrame;
    }

    public void setAmountOfPhotosPerFrame(int amountOfPhotosPerFrame) {
        this.amountOfPhotosPerFrame = amountOfPhotosPerFrame;
    }

    public int getTotalAmountOfPhotos() {
        return totalAmountOfPhotos;
    }

    public void setTotalAmountOfPhotos(int totalAmountOfPhotos) {
        this.totalAmountOfPhotos = totalAmountOfPhotos;
    }

    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    public String getPaperType() {
        return paperType;
    }

    public void setPaperType(String paperType) {
        this.paperType = paperType;
    }

    public Date getSupplyDate() {
        return supplyDate;
    }

    public void setSupplyDate(Date supplyDate) {
        this.supplyDate = supplyDate;
    }

    public Boolean getDone() {
        return isDone;
    }

    public void setDone(Boolean done) {
        isDone = done;
    }

    public int getClientsClientId() {
        return clientsClientId;
    }

    public void setClientsClientId(int clientsClientId) {
        this.clientsClientId = clientsClientId;
    }
}

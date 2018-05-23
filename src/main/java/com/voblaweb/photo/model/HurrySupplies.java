package com.voblaweb.photo.model;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "hurry_supplies")
@EntityListeners(AuditingEntityListener.class)
public class HurrySupplies {

    @Id
    @Column(name = "hurry_supplies_id")
    private int hurrySuppliesId;
    private int typeOfSuppliesTypeId;
    private int branchesBranchId;
    private int price;
    private int amountOfPhotosPerFrame;
    private int totalAmountOfPhotos;
    private String format;
    private String paperType;
    private Date supplyDate;
    private Boolean isDone;
    private int clientsClientId;

    public HurrySupplies(int typeOfSuppliesTypeId, int branchesBranchId, int price, int amountOfPhotosPerFrame, int totalAmountOfPhotos, String format, String paperType, Date supplyDate, Boolean isDone, int clientsClientId) {
        this.typeOfSuppliesTypeId = typeOfSuppliesTypeId;
        this.branchesBranchId = branchesBranchId;
        this.price = price;
        this.amountOfPhotosPerFrame = amountOfPhotosPerFrame;
        this.totalAmountOfPhotos = totalAmountOfPhotos;
        this.format = format;
        this.paperType = paperType;
        this.supplyDate = supplyDate;
        this.isDone = isDone;
        this.clientsClientId = clientsClientId;
    }

    public HurrySupplies() {
    }

    public int getHurrySuppliesId() {
        return hurrySuppliesId;
    }

    public void setHurrySuppliesId(int hurrySuppliesId) {
        this.hurrySuppliesId = hurrySuppliesId;
    }

    public int getTypeOfSuppliesTypeId() {
        return typeOfSuppliesTypeId;
    }

    public void setTypeOfSuppliesTypeId(int typeOfSuppliesTypeId) {
        this.typeOfSuppliesTypeId = typeOfSuppliesTypeId;
    }

    public int getBranchesBranchId() {
        return branchesBranchId;
    }

    public void setBranchesBranchId(int branchesBranchId) {
        this.branchesBranchId = branchesBranchId;
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
